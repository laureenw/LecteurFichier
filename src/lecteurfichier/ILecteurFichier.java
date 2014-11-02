package lecteurfichier;

public interface ILecteurFichier {
	boolean openAndCheck(String nom);
	void readFichier();
	void affiche();
}
