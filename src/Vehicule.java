public abstract class Vehicule implements Deplacement{

        protected String marque;

        public Vehicule(String marque) {
            this.marque = marque;
        }

        public abstract void klaxonner();
    }

