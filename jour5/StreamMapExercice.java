package jour5;

import java.util.stream.Stream;

public class StreamMapExercice {
    
    public static void main(String[] args){
        // Use Stream API pour convertir tous les noms (arguments) en majuscules.
        // Exemple d'entrée: jean paul pierre
        // Exemple de sortie: JEAN PAUL PIERRE

        Stream.of(args)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
