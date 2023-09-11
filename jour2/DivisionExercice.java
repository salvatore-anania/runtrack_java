package jour2;

public class DivisionExercice {
     public static void main(String[] args){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            try{
                System.out.println(a + " / " + b + " = " + (a / b));
            } catch (ArithmeticException e){
                System.out.println("Erreur: DivisionParZeroException.");
            }
    }
}
