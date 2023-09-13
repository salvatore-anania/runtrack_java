package jour5;

import java.util.ArrayList;

public class ArrayListArgumentExercice {
    
    // create an array of String as argument and returns an ArrayList of String
    public static void main(String[] args){
        // create an array of String as argument and returns an ArrayList of String
        ArrayList<String> list = new ArrayList<String>();
        for (String arg : args){
            list.add(arg);
        }
        System.out.println(list);
    }
}
