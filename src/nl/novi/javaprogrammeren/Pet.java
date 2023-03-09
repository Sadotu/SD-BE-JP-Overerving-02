package nl.novi.javaprogrammeren;

public abstract class Pet extends Animal {
    public String nameOwner;
    public String favoriteFood;
    public String species;

    public Pet(String name, char gender, String extraInformation, String nameOwner, String favoriteFood, String species) {
        super(name, gender, extraInformation);
        this.nameOwner = nameOwner;
        this.favoriteFood = favoriteFood;
        this.species = species;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
