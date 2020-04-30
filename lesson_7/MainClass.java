package lesson_7;

public class MainClass {
    public static void main(String[] args) {
        String[] cat = {"Cat1", "Cat2", "Cat3", "Cat4", "Cat5"};
        Cat cat1 = new Cat("Pushok", 7, false);
        Cat cat2 = new Cat("Barsik", 5, false);
        Cat cat3 = new Cat("Sima", 4, false);
        Cat cat4 = new Cat("Varya", 8, false);
        Cat cat5 = new Cat("Vasya", 9, false);

        Plate plate = new Plate(30);
        plate.info();
        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        cat4.eat(plate);
        cat5.eat(plate);
        plate.info();
        cat1.info();
        cat2.info();
        cat3.info();
        cat4.info();
        cat5.info();
        plate.info();
        plate.moreFood();
        plate.info();
    }
}
