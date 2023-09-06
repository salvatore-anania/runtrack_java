package jour1;

public class HelloWorld {
    public static void main(String[] args) {
        
        System.out.println("Veuillez saisir votre prenom :");
        String prenom = System.console().readLine();
        System.out.println("Bonjour, " + prenom + " !");
    }
}
