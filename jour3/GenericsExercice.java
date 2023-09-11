package jour3;

public class GenericsExercice {
    public class Box<T> {
        // T stands for "Type"
        private T t;
    
        public void set(T t) { this.t = t; }
        public T get() { return t; }
    }
    public static void main(String[] args){
        if(args[0].equals("string")){
            Box<String> stringBox = new GenericsExercice().new Box<String>();
            stringBox.set(args[1]);
            // integerBox.set("10"); // error: incompatible types: String cannot be converted to Integer
            System.out.println("Contenu de la boite : " +stringBox.get());
        }else if(args[0].equals("int")){
            Box<Integer> integerBox = new GenericsExercice().new Box<Integer>();
            integerBox.set(Integer.parseInt(args[1]));
            // integerBox.set("10"); // error: incompatible types: String cannot be converted to Integer
            System.out.println("Contenu de la boite : " +integerBox.get());
        }
        
    }
}