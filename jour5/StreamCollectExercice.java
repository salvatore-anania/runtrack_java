package jour5;

import java.util.stream.Stream;

public class StreamCollectExercice {
    
    public static void main(String[] args){
        // Utilisez la Stream API pour filtrer et collecter dans une liste tous les nombres (arguments) inférieurs à une certaine valeur.
        // Exemple d'entrée: 25 12 35 46 18 50 11 20 50
        // Exemple de sortie: [12, 18, 11, 20]
        int value = 25;
        System.out.println("Numbers less than " + value + " are:");
        Stream.of(args)
            .mapToInt(Integer::parseInt)
            .filter(num -> num < value)
            .forEach(System.out::println);
    }
}
