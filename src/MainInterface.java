public class MainInterface {
    public static void main(String[] args) {
        Vehicule [] vehicule = new Vehicule[2];
        vehicule[1]=new Voiture("BMW");
        vehicule [2]=new Velo("BMX");
        for (Vehicule v : vehicule) {
            v.klaxonner();
        }

    }
}
