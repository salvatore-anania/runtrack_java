package jour4;

public class SimpleThreadExercice {
    public static void main(String[] args){
        // create a thread that prints "Salut du thread !" every 1000ms five times

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Salut du thread !");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println("Erreur: InterruptedException.");
                }
            }
        });
        thread.start();

    }
}