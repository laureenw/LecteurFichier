package lecteurfichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

public class LecteurCompare extends LecteurFichier{

	private String source;
	private String source2;

	public LecteurCompare(String source) {
		// TODO Auto-generated constructor stub
		super();
		this.source = source;
		this.source2 = source2;
	}

	public void affiche() {
		
		// Instantiation d'un collator francais
	    Collator compareOperator = Collator.getInstance (Locale.FRENCH);    
	   
	    // Comparaison strict
	    compareOperator.setStrength (Collator.TERTIARY);
	    System.out.println ("\nComparaison strength = TERTIARY");    
		
		boolean compare = super.openAndCheck(source);
		if (compare == true) {
			super.readFichier();
			String ct1[] = contenu.toArray(new String[contenu.size()]);
			String ct2[] = contenu2.toArray(new String[contenu2.size()]);
			
			for (int i = 0; i < ct1.length; i++) {
				for (int j = 0; j < ct2.length; j++) {
					int result = compareOperator.compare(ct1[i], ct2[j]);
					System.out.println(" "+ ct1[i]
										+ " et "+ ct2[j]
										+ (result == 0
											? " : identiques"
											: " : différents"));
				}
			}
		} else {
			System.out.println("Fichier vide ou inexistant");
		}
		  
	}
}
