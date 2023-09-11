package jour3;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamChainesExercice {
    public static void main(String[] args){
        // create a stream of integers from the args array

        Stream<String> stream = Arrays.stream(args).filter(x -> x.length() ==3 && x.charAt(0) == 'a');
        System.out.print("Mots filtrés : ");
        stream.forEach(s -> System.out.print(s+", "));
    }
}
