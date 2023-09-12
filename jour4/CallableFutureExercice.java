package jour4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class CallableFutureExercice implements Callable<Integer> {
    // use the Callable interface to create a thread that multiplies two numbers and use a Future to get the result

    private int a;
    private int b;

    public CallableFutureExercice(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception{
       Thread.sleep(1000);
        return a * b;      
    }

    public static void main(String[] args){
        ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();
        CallableFutureExercice callable = new CallableFutureExercice(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        // create a thread that multiplies two numbers and use a Future to get the result
        Future<Integer> future = executor.submit(callable);

        try {
            System.out.println("Le résultat est: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();

    }


}
