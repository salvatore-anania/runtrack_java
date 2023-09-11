package jour1;

public class BanqueTest {
    int solde;

    public BanqueTest(){
        this.solde = 100;
    }

    public void afficherSolde(){
        System.out.println("Votre solde est de " + solde + " euros.");
    }

    public void depot(int montant){
        this.solde += montant;
        System.out.println("Vous avez déposé " + montant + " euros. Nouveau solde : " + this.solde + " euros.");
    }

    public void retrait(int montant){
        if (montant > this.solde){
            System.out.println("Tentative de retrait de " + montant + " euros. Solde insuffisant.");
        }
        else{
            this.solde -= montant;
            System.out.println("Vous avez retiré " + montant + " euros. Nouveau solde : " + this.solde + " euros.");
        }
    }
    public static void main(String[] args){
        
        BanqueTest compte = new BanqueTest();
        compte.afficherSolde();
        compte.depot(50);
        compte.retrait(70);
        compte.retrait(100);
    }
}
