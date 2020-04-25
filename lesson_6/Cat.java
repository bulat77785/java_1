package lesson_6;

public class Cat extends Animal {
    int swimp, distance;
    String names;


    public Cat(int dist, int swim, String name) {
        distance = dist;
        swimp = swim;
        names = name;
    }

    public void catInfo() {
        if (distance > 250) {
            System.out.println(names + " не может бегать больше 250 метров");
        } else System.out.println(names + " пробежал " + distance + " метров");
        if (swimp > 0) {
            System.out.println(names + " не умеет плавать");
        }
    }
}
