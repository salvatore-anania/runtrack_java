package jour5;

import java.util.HashSet;

public class HashSetArgumentExercice {
    

    public static void main(String[] args){
        // Add to a HashSet all the given string arguments with no repeated and print it
        // 
        // Output: [Hello, World, Java]

        HashSet<String> set = new HashSet<String>();
        for (String arg : args) {
            set.add(arg);
        }
        System.out.println(set);


    }
}
