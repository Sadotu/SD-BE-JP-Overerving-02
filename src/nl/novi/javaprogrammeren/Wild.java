package nl.novi.javaprogrammeren;

public abstract class Wild extends Animal {
    public String pen;
    public String dayLastFood;
    public String countryOfOrigin;

    public Wild(String name, char gender, String extraInformation, String pen, String dayLastFood, String countryOfOrigin) {
        super(name, gender, extraInformation);
        this.pen = pen;
        this.dayLastFood = dayLastFood;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getPen() {
        return pen;
    }

    public void setPen(String pen) {
        this.pen = pen;
    }

    public String getDayLastFood() {
        return dayLastFood;
    }

    public void setDayLastFood(String dayLastFood) {
        this.dayLastFood = dayLastFood;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
