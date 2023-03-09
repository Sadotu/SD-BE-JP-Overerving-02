package nl.novi.javaprogrammeren;

public abstract class Animal {
    public String name;
    public char gender;
    public String extraInformation;

    public Animal(String name, char gender, String extraInformation) {
        this.name = name;
        this.gender = gender;
        this.extraInformation = extraInformation;
    }

    public void move() {
        System.out.println(name + " moved 0.25 meters.");
    }

    public void sound() { System.out.println(name + " makes a sound"); }

    public void sleep() { System.out.println(name + " is fast asleep"); }

    public void eat(String food) { System.out.println(name + " gobbles up its food"); }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(String extraInformation) {
        this.extraInformation = extraInformation;
    }
}
