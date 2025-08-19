public class Voiture extends Vehicule {

    public Voiture(String marque) {
        super(marque);
    }

    @Override
    public void klaxonner() {
        System.out.println(marque + " : Klaxon de voiture");
    }

    @Override
    public void avancer() {
        System.out.println(marque + " avance");
    }

    @Override
    public void reculer() {
        System.out.println(marque + " recule");
    }
}



