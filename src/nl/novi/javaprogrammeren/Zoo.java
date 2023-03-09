package nl.novi.javaprogrammeren;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<String> animals;

    public Zoo() {
        this.animals = new ArrayList<String>();
    }

    public void addAnimal(String animal) {
        this.animals.add(animal);
    }

    public void printAnimals() {
        System.out.println(String.join(", ", this.animals));
    }
}
