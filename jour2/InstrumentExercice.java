package jour2;

public class InstrumentExercice {
    public interface Instrument{
        public void jouer();
    }
    
    public static class Guitare implements Instrument{
        public void jouer(){
            System.out.println("La guitare joue un air rock.");
        }
    }

    public static class Piano implements Instrument{
        public void jouer(){
            System.out.println("Le piano joue une mélodie douce.");
        }
    }

    public static void main(String[] args){
        Instrument[] instruments = new Instrument[2];
        instruments[0] = new Guitare();
        instruments[1] = new Piano();
        for (Instrument instrument : instruments){
            instrument.jouer();
        }
    }
    
}
