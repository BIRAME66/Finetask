import java.util.Scanner;
import java.util.Arrays;

public class AnalyseText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cher utilisateur veuillez saisir une phrase");
        String phrase = scanner.nextLine();

        System.out.println("Votre phrase est : " + phrase);

        String[] mots = phrase.split(" ");

        System.out.println("En forme de tableau :");
        System.out.println("Tableau des mots : " + Arrays.toString(mots));

        System.out.println("Nombre de mots : " + mots.length);

        System.out.println("Ligne par ligne :");
        for (int i = 0; i < mots.length; i++) {
            System.out.println("Mot[" + i + "] = " + mots[i]);
        }

        System.out.print("Phrase inversée mot à mot : ");
        for (String mot : mots) {
            String motInverse = new StringBuilder(mot).reverse().toString();
            System.out.print(motInverse + " ");
        }
    }
}
