package nl.novi.javaprogrammeren;

public class Dog extends Pet {
    public Dog(String name, char gender, String extraInformation, String nameOwner, String favoriteFood, String species) {
        super(name, gender, extraInformation, nameOwner, favoriteFood, species);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " barks");
    }
}
