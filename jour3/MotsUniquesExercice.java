package jour3;

public class MotsUniquesExercice {
    
    public static void main(String[] args){
        // search for uniques words in args and print them
        for (int i = 0; i < args.length; i++){
            boolean isUnique = true;
            for (int j = 0; j < args.length; j++){
                if (i != j && args[i].equals(args[j])){
                    isUnique = false;
                }
            }
            if (isUnique){
                System.out.println(args[i]);
            }
        }
    }
}
