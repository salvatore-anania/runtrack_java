package jour1;

public class job02 {
    public static void main(String[] args) {
        
        class Voiture {
            String marque;
            String couleur;
            int vitesse;

            public Voiture(String marque, String couleur) {
                this.marque = marque;
                this.couleur = couleur;
                this.vitesse = 0;
            }

            public void demarrer() {
                System.out.println("La voiture démarre.");
            }

            public void accelererde10() {
                this.vitesse += 10;
                System.out.println("La vitesse de la voiture est de " + (this.vitesse) + " km/h.");
            }

            public void freiner() {
                System.out.println("La voiture s'arrête, sa vitesse est reinitialisée à 0 km/h.");
                this.vitesse = 0;
            }
        }

        Voiture voiture1 = new Voiture("Renault", "Bleue");
        voiture1.demarrer();
        voiture1.accelererde10();
        voiture1.accelererde10();
        voiture1.freiner();
    }
}
