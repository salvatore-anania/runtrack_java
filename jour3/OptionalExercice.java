package jour3;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExercice {

    public static String check(String[] args){
        String[] test=new String[]{};
        String[] test2=null;
        System.out.println(test);
        System.out.println(test2);
        Optional<String> value = Optional.ofNullable(test[0]);
        System.out.println(value.isEmpty());
        if (value.isEmpty()){
            return "Chaine non fournie";
        } else {
            System.out.println(args[0].length());
            return "Chaine fournie";
        }
    }
    public static void main(String[] args){
        // check if args is Null with Optional
        System.out.println(check(args));
    }
}
