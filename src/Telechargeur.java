public class Telechargeur implements Runnable {
    private String nom;
    public Telechargeur(String nom) {
        this.nom = nom;
    }
    @Override
    public void run() {
        System.out.println("Debut telechargement"+nom);
           try{
               Thread.sleep(6000);}catch(InterruptedException e){
               System.out.println("Erreur telechargement"+nom);

           }
        System.out.println("Fin du telechargement"+nom);


    }

}
