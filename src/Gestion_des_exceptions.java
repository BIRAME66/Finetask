import java.util.Scanner;
import java.util.InputMismatchException;

public class Gestion_des_exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somme = 0;
        int note;

        System.out.println("Saisissez cinq notes entre 0 ET 20");

        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.print("Note " + (i + 1) + " : ");
                    note = scanner.nextInt();

                    if (note < 0 || note > 20) {
                        System.out.println("Erreur : la note doit être entre 0 et 20.");
                    } else {
                        somme += note;
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erreur : veuillez entrer un nombre entier.");
                    scanner.nextLine();
                }
            }
        }

        System.out.println("Somme des notes : " + somme);
        System.out.println("La moyenne est egal : "+somme/5);
    }
}








