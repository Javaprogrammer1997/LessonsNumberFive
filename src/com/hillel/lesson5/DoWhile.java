package com.hillel.lesson5;

public class DoWhile {
    public static void main(String[] args) {
        // Do - While
        int Number = 7;
        int j = 1; // Счетчик для вывода на экран

        do{
            System.out.println("Номер числа " + j + ": " + "Число " + Number);
            Number+=7;
            j++;
        } while (Number % 7 == 0 && Number <= 105 );
    }
}
