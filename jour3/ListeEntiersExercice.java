package jour3;

public class ListeEntiersExercice {
    
    public static void main(String[] args){
        int[] listeEntiers = new int[args.length];
        int somme = 0;
        for (int i = 0; i < args.length; i++){
            listeEntiers[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < listeEntiers.length; i++){
            if (listeEntiers[i] % 2 == 0){
                somme += listeEntiers[i];
            }
        }
        System.out.println("La somme des nombres pairs est " + somme + ".");
    }
}
