package nl.novi.javaprogrammeren;

public class AnimalMain {
    /*
    Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.

    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op en de hoeveelheid kinderen.

    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op. Ook willen we het aantal strepen weten.

    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.
    Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
    of het een binnen of buitenkat is.

    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
    herkomst op. Ook willen we de naam van de roedel weten.

    Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een dier beweegt print je in
    de console dat deze 0.25 meter is verplaatst.

    Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

    Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

    Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

    Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.

     */
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger("Tony", 'M', "Likes to swim", "Pen 1", "2022-11-01", "India");
        Tiger tiger2 = new Tiger("Simba", 'M', "Loves to play with toys", "Pen 2", "2022-11-02", "Africa");
        Tiger tiger3 = new Tiger("Shere Khan", 'M', "Enjoys sunbathing", "Pen 3", "2022-11-03", "India");

        Lion lion1 = new Lion("Mufasa", 'M', "Likes to roar", "Pen 4", "2022-11-04", "Africa");
        Lion lion2 = new Lion("Nala", 'F', "Enjoys playing with cubs", "Pen 5", "2022-11-05", "Africa");
        Lion lion3 = new Lion("Scar", 'M', "Prefers to be alone", "Pen 6", "2022-11-06", "Africa");

        Dog dog1 = new Dog("Buddy", 'M', "Loves to fetch", "John Smith", "Bacon treats","Golden Retriever");
        Dog dog2 = new Dog("Bella",'F',"Enjoys belly rubs","Jane Doe","Chicken treats","Labrador Retriever");
        Dog dog3 = new Dog("Max",'M',"Likes to play tug-of-war","Bob Johnson","Beef treats","German Shepherd");

        Cat cat1 = new Cat("Whiskers",'F',"Enjoys napping in the sun","Samantha Brown","Tuna treats","Siamese");
        Cat cat2 = new Cat("Simba",'M',"Likes to chase toys","Emily Davis","Salmon treats","Bengal");
        Cat cat3 = new Cat("Sassy",'F',"Prefers to be petted","Michael Thompson","Chicken treats","Persian");

        Wolf wolf1 = new Wolf("Akela",'M',"Leader of the pack","Pen 7","2022-11-07","North America");
        Wolf wolf2 = new Wolf("Raksha",'F',"Protective of her cubs","Pen 8" ,"2022-11-08" ,"North America");
        Wolf wolf3 = new Wolf("Grey Brother",'M',"Skilled hunter" ,"Pen 9" ,"2022-11-09" ,"North America");

        lion1.move();
        lion2.sound();
        lion3.sleep();

        dog1.move();
        dog2.sound();
        dog3.sleep();

        cat1.move();
        cat2.sound();
        cat3.sleep();

        wolf1.move();
        wolf2.sound();
        wolf3.sleep();

        tiger1.eat("meat");
        tiger2.eat("chicken");
        tiger3.eat("fish");

        Zoo zoo = new Zoo();
        zoo.addAnimal(tiger1.getName());
        zoo.addAnimal(tiger2.getName());
        zoo.addAnimal(tiger3.getName());

        zoo.addAnimal(lion1.getName());
        zoo.addAnimal(lion2.getName());
        zoo.addAnimal(lion3.getName());

        zoo.printAnimals();
    }
}