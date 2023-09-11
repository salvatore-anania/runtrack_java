package jour3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class StreamsOperationExercice {
    
    public static void main(String[] args){
        // create a stream of integers from the args array

        IntStream stream = Arrays.stream(args).mapToInt(Integer::parseInt).map(x -> x * 2).filter(x -> x < 10);
        
        // then create a list of the elements that are left
        List<Integer> list = stream.boxed().toList();
        System.out.println(list);
    }
}
