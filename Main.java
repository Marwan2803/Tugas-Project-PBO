import model.*;
import service.PetService;

public class Main {
    public static void main(String[] args) {
        PetService<Pet> petService = new PetService<>();

        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);

        petService.addPet(dog);
        petService.addPet(cat);

        petService.showAll();
        dog.train();
    }
}
