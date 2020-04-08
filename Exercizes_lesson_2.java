package Lesson_2;

import java.util.ArrayList;
import java.util.Arrays;

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
// [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class Exercizes_lesson_2 {
    static void arr() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void fillArray() {
     int[] arr = new int[8];
     int k = 0;
     for (int i = 0; i < arr.length; i++) {
        arr[i] = k;
        k += 3;
      }
    }
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 6;
            }
        }
    }
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
// цикла(-ов) заполнить его диагональные элементы единицами;
    static void fillDiagonal(int n) {
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j || j == 4 - i - 1) {
                    arr4[i][j] = 1;
                }
            }
        }
    }
// 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    static void newArray() {
        int[] z = {4, 507, 30, 20, 1108, 320, 50, 20, 40, 80, 90, 127};
        int max = 0;
        for (int i = 0; i < z.length; i++) {
            if (z[i] > max) {
                max = z[i];
            }
        }
    }
    // помощи интернета);
    //6.** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
    // true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
    // checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница
    // показана символами ||, эти символы в массив не входят.
   /* static void checkBalance() {
        int[] q = {2, 2, 2, 1, 2, 2, 10, 1};
        int left = 0;
        int right = 0;
        if (left != right) {
            for (int i = 0; i < q.length; i++) {
                q[i] = left;
                for (int j = 0; j < q.length; j++) {
                    q[j] = q[j + 1];
                    q[j] = right;
                }
            }
            return false;
        } else {
            return true;
        }
    }*/
    public static void main(String[] args) {
        //Проверка 1-го задания
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.printf(arr[i] + " ");
        } System.out.printf("\n");
        // Проверка 2-го задания
        int[] arr2 = new int[8];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = k;
            k += 3;
            System.out.printf(arr2[i] + " ");
        }
        System.out.printf("\n");
        // Проверка 3-го задания
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 6;
            }
            System.out.printf(w[i] + " ");
        }
        System.out.printf("\n");
        // Проверка 4-го задания
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j || j == 4 - i - 1) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }
        // Проверка 5-го задания
        int[] z = {4, 507, 30, 20, 1108, 320, 50, 20, 40, 80, 90, 127};
        int max = 0;
        for (int i = 0; i < z.length; i++) {
            if (z[i] > max) {
                max = z[i];
            }
        }
        System.out.print(max);
        // Задание №6 не получается, нет идей.
       /* int[] q = {2, 2, 2, 1, 2, 2, 10, 1};
        int left = 0;
        int right = 0;
        if (left != right) {
            for (int i = 0; i < q.length; i++) {
                q[i] = left;
                for (int j = 0; j < q.length; j++) {
                    q[j] = q[j + 1];
                    q[j] = right;
                }
            }
            System.out.println();
            return false;
        } else {
            return true;
        }*/
    }
}
