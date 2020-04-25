package lesson_6;

public class Dog extends Animal {
    int swimp, distance;
    String names;

    public Dog(int dist, int swim, String name) {
        distance = dist;
        swimp = swim;
        names = name;
    }
    public void dogInfo() {
        if (distance > 500) {
            System.out.println(names + " не может бегать более 500 метров");
        } else System.out.println(names + " пробежал " + distance + " метров");
        if (swimp > 10) {
            System.out.println(names + " не может плавать более 10 метров");
        } else System.out.println(names + " проплыл " + swimp + " метров");
    }
}
