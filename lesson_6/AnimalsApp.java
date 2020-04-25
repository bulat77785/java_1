package lesson_6;

public class AnimalsApp {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat(100, 5, "Пушок");
        Cat cat1 = new Cat(600, 5, "Симба");
        Dog dog = new Dog(150, 15, "Шарик");
        Dog dog1 = new Dog(980, 8, "Дружок");

        cat.catInfo();
        cat1.catInfo();
        dog.dogInfo();
        dog1.dogInfo();
    }
}
