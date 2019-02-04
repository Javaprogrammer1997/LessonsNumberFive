package com.hillel.lesson5;

public class While {
    public static void main(String[] args) {
        // While
        int Number = 7;
        int j = 1; // Счетчик для вывода на экран

        while (Number % 7 == 0 && Number <= 105 ) {
            System.out.println("Номер числа " + j + ": " + "Число "  + Number);
            j++;
            Number += 7;
        }
    }
}
