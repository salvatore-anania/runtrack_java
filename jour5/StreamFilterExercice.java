package jour5;

import java.util.stream.Stream;

public class StreamFilterExercice {
    
    public static void main(String[] args){
        // Use the API Stream to filter all nunmbers given in arguments greater than an set value.
        // Example input:25 12 35 46 18 50 11 20 50
        // Example output: 35 46 50 50

        int value = 25;
        System.out.println("Numbers greater than " + value + " are:");
        Stream.of(args)
            .mapToInt(Integer::parseInt)
            .filter(num -> num > value)
            .forEach(System.out::println);
        

    }
}
