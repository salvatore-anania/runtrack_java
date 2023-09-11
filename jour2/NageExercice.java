package jour2;

public class NageExercice {
    public interface Nageur{
        public void nager();
    }
    
    public static class Poisson implements Nageur{
        public void nager(){
            System.out.println("Le poisson nage rapidement.");
        }
    }

    public static class Homme implements Nageur{
        public void nager(){
            System.out.println("L'Homme nage.");
        }
    }

    public static void main(String[] args){
        Nageur[] nageurs = new Nageur[2];
        nageurs[0] = new Homme();
        nageurs[1] = new Poisson();
        for (Nageur nageur : nageurs){
            nageur.nager();
        }
    }
    
}
