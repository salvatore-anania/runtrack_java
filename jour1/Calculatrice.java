package jour1;

public class Calculatrice {

    public static void main(String[] args) {
        class Calculator{
            public double addition(double a, double b){
                return a + b;
            }
            public double soustraction(double a, double b){
                return a - b;
            }
            public double multiplication(double a, double b){
                return a * b;
            }
            public double division(double a, double b){
                return a / b;
            }
        }

    
        Calculator calculatrice = new Calculator();
        System.out.println("Entrer le premier nombre :");
        double a = Double.parseDouble(System.console().readLine());
        System.out.println("Entrer le deuxième nombre :");
        double b = Double.parseDouble(System.console().readLine());
        System.out.println(calculatrice.addition(a, b));
        System.out.println(calculatrice.soustraction(a, b));
        System.out.println(calculatrice.multiplication(a, b));
        System.out.println(calculatrice.division(a, b));
    }
}
