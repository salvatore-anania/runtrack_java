package jour5;

public class LambdaArgumentExercice {
    
    interface StringFunction {
        String run(String str,int val);
      }

    public static void main(String[] args){

        StringFunction lambda = (str, val) -> {
            if (str.length() > val) {
                return str + " is longer than " + val + " characters";
            } else {
                return str + " is shorter than " + val + " characters";
            }
        };

        System.out.println(lambda.run(args[0], Integer.parseInt(args[1])));
    }
}
