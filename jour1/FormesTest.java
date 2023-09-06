package jour1;

public class FormesTest {
    public static void main(String[] args) {
        class Carre{
            double cote;

            public Carre(double cote){
                this.cote = cote;
            }

            public void surface(){
                System.out.println("L'aire du carré est " + (this.cote * this.cote));
            }
        }

        class Cercle{
            double rayon;

            public Cercle(double rayon){
                this.rayon = rayon;
            }

            public void surface(){
                System.out.println("L'aire du cercle est " + (Math.PI * this.rayon * this.rayon));
            }
        }

        Carre carre = new Carre(4);
        carre.surface();
        Cercle cercle = new Cercle(5);
        cercle.surface();
    }
}
