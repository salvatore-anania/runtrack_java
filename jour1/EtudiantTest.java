package jour1;

import java.util.Arrays;

public class EtudiantTest {
    public static void main(String[] args) {

        class Etudiant{
            String nom;
            int[] notes;

            public Etudiant(String nom, int[] notes){
                this.nom = nom;
                this.notes = notes;
            }

            public void ajouterNote(){
                int[] newNotes = new int[this.notes.length + 1];
                for (int i = 0; i < this.notes.length; i++){
                    newNotes[i] = this.notes[i];
                }
                System.out.println("Veuillez saisir la nouvelle note :");
                newNotes[this.notes.length] = Integer.parseInt(System.console().readLine());
                this.notes = newNotes;
            }

            public void afficherNoteLaPlusHaute(){
                int noteLaPlusHaute = 0;
                for (int i = 0; i < this.notes.length; i++){
                    if (this.notes[i] > noteLaPlusHaute){
                        noteLaPlusHaute = this.notes[i];
                    }
                }
                System.out.println("La note la plus haute est " + noteLaPlusHaute + ".");
            }

            public void afficherNoteLaPlusBasse(){
                int noteLaPlusBasse = 20;
                for (int i = 0; i < this.notes.length; i++){
                    if (this.notes[i] < noteLaPlusBasse){
                        noteLaPlusBasse = this.notes[i];
                    }
                }
                System.out.println("La note la plus basse est " + noteLaPlusBasse + ".");
            }

            public void moyenne(){
                int somme = 0;
                for (int i = 0; i < this.notes.length; i++){
                    somme += this.notes[i];
                }
                System.out.println("La moyenne est " + (somme / this.notes.length) + ".");
            }
        }
        Etudiant etudiant = new Etudiant("Bob", new int[]{15, 12, 18,10});
        System.out.println("Nom de l'etudiant : "+etudiant.nom);
        System.out.println("Notes : " + Arrays.toString(etudiant.notes));
        etudiant.ajouterNote();
        etudiant.afficherNoteLaPlusHaute();
        etudiant.afficherNoteLaPlusBasse();
        etudiant.moyenne();
    }
}
