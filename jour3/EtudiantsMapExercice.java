package jour3;

import java.util.HashMap;

public class EtudiantsMapExercice {

    public static void main(String[] args){
        // create a map of students where the ID is the key and the name is the value

        HashMap<Integer, String> etudiants = new HashMap<Integer, String>();
        etudiants.put(101, "Pierre");
        etudiants.put(102, "Marie");
        etudiants.put(103, "Jean");
        
        for (Integer key : etudiants.keySet()){
            System.out.println(key + ": " + etudiants.get(key));
        }
    }
    
}
