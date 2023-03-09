package nl.novi.javaprogrammeren;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void printAnimals() {
        for (Animal animal : this.animals) {
            System.out.println(animal.getName());
        }
    }
}
