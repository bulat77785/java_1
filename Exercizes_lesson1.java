public class Exercizes_lesson1 {
    // Задания выполнил. В этом файле задания с 2-го по 8-е. Задание N7 не смог выполнить с помощью метода, поэтому просто написал имя.
    // Задания сделаны с опозданием, т.к. меня добавили в группу кога вы уже изучали 5-й урок.
    //Потом было некогда, т.к. болел.
    static int sum(int i, int u, int j, int o) {
        int res = i * (u + (j / o));
        System.out.println(res);
        return 0;
    }
    static int sum1(int a, int b) {
        int res = a + b;

        if (res >= 10 && res <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return 0;
    }
    static void num(int k) {
        if (k >= 0) {
            System.out.println("В консоль передано положительное число " + k);
        } else {
            System.out.println("В консоль передано отрицательное число " + k);
        }
    }
    static int number(int p) {
        if (p < 0) {
            System.out.println(true);
        } else System.out.println(false);
        return 0;
    }
   /* static void String(str) {
        System.out.printf("Привет, " + "%s", str);
    }*/
   static int year(int z) {
       //int cc = 100;
       //int dd = 400
       int aa = z%100;
       int bb = z%400;
       int cc = z%4;

        while (z > 0) {
            if (aa == 0 && bb == 0) {
                System.out.println("Этот год високосный (раз в 400 лет)");
            } else if (aa == 0 && bb != 0) {
                System.out.println("Этот год не является високосным (раз в 100 лет)");
            } else if (cc == 0) {
                System.out.println("Этот год является високосным");
            } else if (cc != 0) {
                System.out.println("Этот год не является високосным");
            } else {
                System.out.println("Число введено неверно");
            }
            return 0;
        }
        return 0;
   }

    public static void main(String[] args) {
        byte e = 1;
        short s = 4;
        int ii = 45;
        long n = 655454;
        float kk = 3.6f;
        double w = 2 / 3.;
        boolean b1 = true;
        char ch = 'a';
        sum(4, 3,6,3);
        sum1 (2, 9);
        num(-11);
        number(-9);
        System.out.println(e);
        System.out.println(s);
        System.out.println(ii);
        System.out.println(n);
        System.out.println(kk);
        System.out.println(b1);
        System.out.println(w);
        System.out.println(ch);
        String str = "Булат";
        System.out.printf("Привет, " + "%s\n", str);
        year(1924);

    }
}
