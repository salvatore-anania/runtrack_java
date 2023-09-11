package jour2;

public class VoitureExercice{

    public class VoitureException extends Exception {
      
        public VoitureException(String s) {
          super(s);
        }
    }

    public static class TestVitesse {
        public static void controle(int vitesse) throws VoitureException {
            if (vitesse > 100){
                VoitureExercice test= new VoitureExercice();
                throw test. new VoitureException("Erreur: VitesseLimiteDepasseException.");
            }
        }
    }

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

            public void accelererde110() {
                
                
                try {
                    TestVitesse.controle(this.vitesse += 110);
                    System.out.println("La vitesse de la voiture est de " + (this.vitesse) + " km/h.");
                  } catch (VoitureException e) {
                    System.out.println(e.getMessage());
                  }
            }

            public void freiner() {
                System.out.println("La voiture s'arrête, sa vitesse est reinitialisée à 0 km/h.");
                this.vitesse = 0;
            }

            

     }       
    public static void main(String[] args) {
        
        
        VoitureExercice voitureExercice = new VoitureExercice();
        Voiture voiture1 = voitureExercice.new Voiture("Renault", "Bleue");
        voiture1.accelererde110();
    }
    
}