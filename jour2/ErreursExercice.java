package jour2;

public class ErreursExercice{

    public class NullPointerException extends Exception {
        public NullPointerException(String s) {
          super(s);
        } 
    }

    public class ArrayIndexOutOfBondsException extends Exception {
        public ArrayIndexOutOfBondsException(String s) {
          super(s);
        } 
    }

    public class ArithmeticException extends Exception {
        public ArithmeticException(String s) {
          super(s);
        } 
    }
      
    public class TestNullPointerException{
        public static void controle(String args[]) throws NullPointerException{
            if (args.length == 0){
                throw new ErreursExercice(). new NullPointerException("Erreur: NullPointerException.");
            }
        }
    }

    public class TestArrayIndexOutOfBondsException{
        public static void controle(String args[]) throws ArrayIndexOutOfBondsException{
            if (args.length != 2){
                throw new ErreursExercice(). new ArrayIndexOutOfBondsException("Erreur: ArrayIndexOutOfBondsException.");
            }
        }
    }

    public class TestArithmeticException{
        public static void controle(int arg) throws ArithmeticException{
            if (arg==0){
                throw new ErreursExercice(). new ArithmeticException("Erreur: ArithmeticException.");
            }
        }
    }

    public static void main(String[] args){
        
        try{
            TestNullPointerException.controle(args);
            TestArrayIndexOutOfBondsException.controle(args);
            TestArithmeticException.controle(Integer.parseInt( args[1]));
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a + " / " + b + " = " + (a / b));
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBondsException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
}
