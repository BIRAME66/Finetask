import java.util.ArrayList;
import java.util.Scanner;

public class GestionListeDeCourses {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        boolean quitter = false;
        while (!quitter) {
            System.out.println("====== MENU ======");
            System.out.println("Ajouter un article-1");
            System.out.println(" Supprimer un article--2");
            System.out.println(" Afficher la liste---3");
            System.out.println(" Vérifier la présence d'un article----4");
            System.out.println("Quitter-----5");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine();


            switch (choix) {
                case 1:
                    System.out.print("Nom de l'article à ajouter : ");
                    String article_ajouter = scanner.nextLine();
                    liste.add(article_ajouter);
                    System.out.println("Article ajouté !");
                    break;
                case 2:
                    System.out.print("Nom de l'article à supprimer : ");
                    String article_supprimer = scanner.nextLine();
                    if (liste.remove(article_supprimer)) {
                        System.out.println("Article supprimé !");
                    } else {
                        System.out.println("Article non trouvé dans la liste.");
                    }
                    break;
                case 3:
                    System.out.println("Liste des articles :");
                    for (String art : liste) {
                        System.out.println("-" + art);
                    }
                    break;

                case 4:
                    System.out.print("Nom de l'article à vérifier : ");
                    String article_verifier = scanner.nextLine();
                    if (liste.contains(article_verifier)) {
                        System.out.println("L'article est présent dans la liste.");
                    } else {
                        System.out.println("L'article n'est pas dans la liste.");
                    }
                    break;

                case 5:
                    quitter = true;
                    System.out.println("Au revoir !");
                    break;

            }
        }

        scanner.close();
    }
}
