package lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            full = true;
        }
    }
    public void info() {
        if (!full) {
            System.out.println(name + " не может поесть, т.к. на тарелке недостаточно еды");
        } else {
            System.out.println(name + " наелся? Ответ: " + full);
        }
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else return false;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void moreFood() {
            food = 30;
            System.out.println("Тарелка снова наполнена, можно поесть");
    }
}
