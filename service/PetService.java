package service;

import model.Pet;
import java.util.ArrayList;
import java.util.List;

public class PetService<T extends Pet> {
    private List<T> pets = new ArrayList<>();

    public void addPet(T pet) {
        pets.add(pet);
    }

    public void showAll() {
        for (T pet : pets) {
            pet.sound();
        }
    }
}
