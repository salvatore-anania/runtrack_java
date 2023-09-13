package jour5;

public class StreamFilterExercice {
    
    public static void main(String[] args){
        // Use Stream API to filter all nunmbers given in arguments greater than an set value.

        // Example input:25 12 35 46 18 50 11 20 50

        int value = 25;
        System.out.println("Numbers greater than " + value + ":");
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num > value) {
                System.out.println(num);
            }
        }

    }
}
