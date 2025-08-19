public class Velo extends Vehicule  {
    public Velo(String marque) {
        super(marque);
    }

    @Override
    public void klaxonner() {
        System.out.println(marque+"klaxonne ");

    }

    @Override
    public void avancer() {
        System.out.println(marque+"pedale pour avancer");


    }

    @Override
    public void reculer() {
        System.out.println(marque+"reculer avec les jambes");

    }
}
