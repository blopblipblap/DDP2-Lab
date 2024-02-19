import java.util.List;
import java.util.ArrayList;

public class PetSimulator {

    public static void main(String[] args) {
        StatusBehavior eat = new Eat();
        StatusBehavior idle = new Idle();
        StatusBehavior sleep = new Sleep();

        List<Pet> pets = new ArrayList<>();
        Pet koren = new Cat("Koren", 2);
        Pet barky = new Dog("Barky", 3);
        Pet tiwar = new Cat("Tiwar", 2);
        pets.add(koren);
        pets.add(barky);
        System.out.println();

        System.out.println("==========CHECK SOUND=========");
        for(Pet pet: pets) {
            pet.makeSound();
        }
        System.out.println("==============================\n");

        System.out.println("==========CHECK POWER=========");
        for(Pet pet: pets) {
            pet.doPower();
        }
        System.out.println("==============================\n");

        System.out.println("=====LET'S PLAY WITH ME=====");
        for(Pet pet: pets) {
            pet.play();
        }
        System.out.println("==============================\n");

        barky.setStatusBehavior(sleep);

        System.out.println("=====LET'S PLAY WITH ME=====");
        for(Pet pet: pets) {
            pet.play();
        }
        System.out.println("==============================\n");

        System.out.println("==========PET INFO============");
        for(Pet pet: pets) {
            System.out.println(pet);
        }
        System.out.println("==============================\n");

        pets.add(tiwar);
        tiwar.setStatusBehavior(eat);
        System.out.println();

        System.out.println("=====LET'S PLAY WITH ME=====");
        for(Pet pet: pets) {
            pet.play();
        }
        System.out.println("==============================\n");

        System.out.println("==========PET INFO============");
        for(Pet pet: pets) {
            System.out.println(pet);
        }
        System.out.println("==============================\n");
    }
}
