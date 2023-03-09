package nl.novi.javaprogrammeren;

public class Tiger extends Wild {
    public Tiger(String name, char gender, String extraInformation, String pen, String dayLastFood, String countryOfOrigin) {
        super(name, gender, extraInformation, pen, dayLastFood, countryOfOrigin);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " Roars");
    }
}
