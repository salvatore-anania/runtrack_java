package jour1;

public class JeuDeDes {
    public static void main(String[] args){
        int de1 = (int)(Math.random() * 6 + 1);
        int de2 = (int)(Math.random() * 6 + 1);
        int somme = de1 + de2;
        System.out.println("Le premier dé a fait " + de1 + ", le second " + de2 + ". La somme des deux est " + somme + ".");
    }
}
