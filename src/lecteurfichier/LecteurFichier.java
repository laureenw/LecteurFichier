package lecteurfichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

abstract public class LecteurFichier implements ILecteurFichier {
	
	protected ArrayList<String> contenu;
	protected ArrayList<String> contenu2;
	File file;
	File file2;
		
	public LecteurFichier() {
		// TODO Auto-generated constructor stub
		this.contenu = new ArrayList<String>();
		this.contenu2 = new ArrayList<String>();
		this.file = file;
		this.file = file2;
	}
	
	public boolean openAndCheck(String nom) {
		file = new File(nom);
		file2 = new File(nom);
		if (file.isFile() && file2.isFile()) {
			if (file.canRead() && file2.canRead()) {
				return true;
			}
		}
		return false;
	}
	
	public void readFichier() {
		try{
			InputStream ips=new FileInputStream(file); 
			InputStream ips2=new FileInputStream(file2);
			InputStreamReader ipsr=new InputStreamReader(ips);
			InputStreamReader ipsr2=new InputStreamReader(ips2);
			BufferedReader br=new BufferedReader(ipsr);
			BufferedReader br2=new BufferedReader(ipsr2);
			String ligne;
			String ligne2;
			while ((ligne=br.readLine())!=null && (ligne2=br2.readLine())!=null){
				contenu.add(ligne);
				contenu2.add(ligne2);
			}
			br.close(); 
			br2.close();
		}		
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public abstract void affiche();

}
