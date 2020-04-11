package Lesson_2;

import java.util.Random;
import java.util.Scanner;

public class Ex_les_3 {
    /*Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
   /*static int cycle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Желаете поиграть еще раз? Для продолжения нажмите '0', для окончания '1'");
        int b = sc.nextInt();
        int i = -1;
        if (b == 0) {
             i = -1;
            Random rand = new Random();
            int x = rand.nextInt(10);
            return (i = -1);
        } else if (b == 1){
            i = -1;
            System.out.println("Игра завершена");
            return (i = 2);
        } else {
            System.out.println("Для продолжения нажмите '0', для окончания '1'");
        }
        sc.close();
        return -1;
    }*/

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9 с 3-х попыток");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите число: ");
            int a = sc.nextInt();
            if (a > x) {
                System.out.println("Введенное число больше загаданного");
                if (i == 2 && a != x) {
                    System.out.println("К сожалению вы проиграли.");
                    System.out.println("Желаете поиграть еще раз? Для продолжения нажмите '0', для окончания '1'");
                    int b = sc.nextInt();
                    if (b == 0) {
                        i = -1;
                        x = rand.nextInt(10);
                    } else if (b == 1){
                        System.out.println("Игра завершена");
                        break;
                    }
                }
            } else if (a < x) {
                System.out.println("Введенное число меньше загаданного");
                if (i == 2 && a != x) {
                    System.out.println("К сожалению вы проиграли.");
                    System.out.println("Желаете поиграть еще раз? Для продолжения нажмите '0', для окончания '1'");
                    int b = sc.nextInt();
                    if (b == 0) {
                        i = -1;
                        x = rand.nextInt(10);
                    } else if (b == 1){
                        System.out.println("Игра завершена");
                        break;
                    }
                }
            } else {
                System.out.println("Вы угадали!");
                System.out.println("Желаете поиграть еще раз? Для продолжения нажмите '0', для окончания '1'");
                int b = sc.nextInt();
                if (b == 0) {
                    i = -1;
                    x = rand.nextInt(10);
                } else if (b == 1){
                    System.out.println("Игра завершена");
                    break;
                } else {
                    System.out.println("Для продолжения нажмите '0', для окончания '1'");
                }
            }
        }
        sc.close();
    }
}
