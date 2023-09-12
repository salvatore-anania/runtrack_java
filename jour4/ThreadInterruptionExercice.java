package jour4;

public class ThreadInterruptionExercice {
    
    public static void main(String[] args){
        // Create a thread sleeping for a given time and interrupt it after half of the time
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    Thread.sleep(1000*Integer.parseInt(args[0]));
                } catch (InterruptedException e) {
                    System.out.println("Le thread a été interrompu");
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(1000*Integer.parseInt(args[0])/2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();

        
    }
}
