package lecteurfichier;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A l'envers :");
		LecteurReverse launchReverse = new LecteurReverse("test.txt");
		launchReverse.affiche();
		System.out.println("Mani�re palindromique :");
		LecteurPalindrome launchPalindrome = new LecteurPalindrome("test.txt");
		launchPalindrome.affiche();
		System.out.println("Diff�rences entre test et test2 :");
		LecteurCompare launchCompare = new LecteurCompare("test.txt");
		launchCompare.affiche();
	}

}
