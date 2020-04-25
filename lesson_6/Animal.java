package lesson_6;

/*public class Animal {
    int dist;

    public Animal(int dist) {
        this.dist = dist;
    }

    public void run () {
        System.out.println("Животное пробежало " + dist + " метров");
    }
}*/
public class Animal {
    int dist, swim;
    private String name;

    public Animal() {
    }

    public Animal(int dist, int swim, String name) {
        this.dist = dist;
        this.swim = swim;
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void jump() {
        System.out.println("Животное подпрыгнуло");
    }
}

