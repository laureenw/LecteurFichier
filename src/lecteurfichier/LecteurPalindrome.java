package lecteurfichier;

public class LecteurPalindrome extends LecteurFichier{

	private String source;

	public LecteurPalindrome(String source) {
		// TODO Auto-generated constructor stub
		super();
		this.source = source;
	}

	public void affiche() {
		boolean palindrome = super.openAndCheck(source);
		if (palindrome == true) {
			super.readFichier();
			String contenuInverse = "";
			for (int i=0; i < contenu.size(); i++){
				String [] tabMot = contenu.get(i).split(" ");
				for (int a=0; a < tabMot.length; a++) {
					int taille = tabMot[a].length();
					for (int b=taille-1; b > -1; b--) {
						contenuInverse += tabMot[a].substring(b, b+1);
					}
					contenuInverse += " ";
				}
				contenuInverse += "\n";
			}
		System.out.println(contenuInverse);
		} else {
			System.out.println("Fichier vide ou inexistant");
		}
	}

}
