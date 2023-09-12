package jour4;

import java.util.concurrent.ExecutorService;

public class ExecutorServiceExercice {
    
    public static void main(String[] args){
        // Use Executor Service to create a pool and execute some task wich multiply an argument by the same increasing number from 0 to 9.
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++){
            final int j = i;
            Runnable task = new Runnable(){
                @Override
                public void run(){
                    System.out.println(Thread.currentThread().getName() + " : " + Integer.parseInt(args[0]) * j);
                }
            };
            executor.execute(task);
        }
        executor.shutdown();
    }
}
