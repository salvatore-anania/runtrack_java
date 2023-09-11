package jour2;

public class AnimalExercice {
    
    public abstract class Animal {
        public abstract void faireDuBruit();
    }

    public class Chien extends Animal {
        public void faireDuBruit(){
            System.out.println("Le chien aboie.");
        }
    }

    public class Chat extends Animal {
        public void faireDuBruit(){
            System.out.println("Le chat miaule.");
        }
    }

    public class Oiseau extends Animal {
        public void faireDuBruit(){
            System.out.println("L'oiseau chante.");
        }
    }

    public static void main(String[] args){
        AnimalExercice animalExercice = new AnimalExercice();
        Animal[] animaux = new Animal[3];
        animaux[0] = animalExercice.new Chat();
        animaux[1] = animalExercice.new Chien();
        animaux[2] = animalExercice.new Oiseau();
        for (Animal animal : animaux){
            animal.faireDuBruit();
        }
    }
}
