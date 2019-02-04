package com.hillel.lesson5;

public class For {
    public static void main(String[] args) {
        // For 1-й Способ
        int j = 1; // Счетчик для вывода на экран

        for (int i = 7; i <= 105; i += 7) {

            System.out.println("Номер числа " + j + ": " + "Число " + i + " ");
            j++;
        }
        // For 2-й Способ
       /* int j = 1; // Счетчик для вывода на экран

        for (int i = 1; i <=105; i++) {
            if (i % 7 == 0) {
                System.out.println("Номер числа " + j + ": " + i + " ");
                j++;
            }
        }
            */
    }
}

