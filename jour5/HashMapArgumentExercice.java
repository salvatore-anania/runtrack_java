package jour5;

import java.util.HashMap;

public class HashMapArgumentExercice {
    //Considérez que chaque paire d'arguments est une clé et une valeur. Ajoutez ces paires à une HashMap et affichez-les.

    //Exemple d'entrée: nom jean age 25 ville paris
    //Exemple de sortie: nom: jean age: 25 ville: paris

    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < args.length; i+=2) {
            map.put(args[i], args[i+1]);
        }
         
        map.forEach((key, value) -> System.out.println(key + ": " + value));
         
    }
}
