package jour4;

public class RunnableInterfaceExercice {
    
    public static void main(String[] args){
     // create a thread implementing runnable that prints "En coursd'exécution..." five times every 1000ms
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 5; i++){
                    System.out.println("En cours d'exécution...");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        System.out.println("Erreur: InterruptedException.");
                    }
                }
            }
        });
        thread.start();
    }
}
