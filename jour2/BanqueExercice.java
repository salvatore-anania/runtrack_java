package jour2;

import jour1.BanqueTest;

public class BanqueExercice extends BanqueTest {
    double courant, epargne, interet;
    public BanqueExercice(double courant, double epargne, double interet){
        super();
        this.courant = courant;
        this.epargne = epargne;
        this.interet = interet;
    }

    public void afficherSolde(){
        System.out.println("Solde du compte courant : " + this.courant);
        System.out.println("Solde du compte épargne : " + this.epargne + " avec un taux d'intérêt de " + this.interet + "%.");
        ajouterInterets();
        System.out.println("Solde du compte épargne avec intérêts : " + this.epargne );
    }

    public void ajouterInterets(){
        
        System.out.println("intérêts ajoutés : " +(this.epargne * (this.interet/100)) +" euros. Nouveau solde : " + this.epargne);
        this.epargne += this.epargne * this.interet/100;
    }
    public static void main(String[] args){

        
        BanqueExercice compte = new BanqueExercice(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        compte.afficherSolde();
    }
}
