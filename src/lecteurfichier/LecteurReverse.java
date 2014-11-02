package lecteurfichier;

public class LecteurReverse extends LecteurFichier {
	
	private String source;

	public LecteurReverse(String source) {
		// TODO Auto-generated constructor stub
		super();
		this.source = source;
	}
	
	public void affiche() {
		boolean reverse = super.openAndCheck(source);
		if (reverse == true) {
			super.readFichier();
			for (int i = contenu.size()-1; i >=0; i--) {
				System.out.println(contenu.get(i));
			}
		} else {
			System.out.println("Fichier vide ou inexistant");
		}
	}
}
