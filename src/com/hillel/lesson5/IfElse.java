package com.hillel.lesson5;
import java.util.Scanner; // Импортируем Сканнер для пользовательского ввода

public class IfElse {
    public static void main(String[] args) {
        // If - Else
        System.out.println("Enter month number");
        Scanner scan = new Scanner(System.in);
        int numberOfMonth = scan.nextInt();

        if (numberOfMonth == 1){
            System.out.println("January first month");
        }
        else if(numberOfMonth == 2) {
            System.out.println("February second month");
        }
        else if(numberOfMonth == 3){
            System.out.println("March third month");
        }
        else if(numberOfMonth == 4){
            System.out.println("April fourth month");
        }
        else if(numberOfMonth == 5){
            System.out.println("May fifth month");
        }
        else if(numberOfMonth == 6){
            System.out.println("June sixth month");
        }
        else if(numberOfMonth == 7){
            System.out.println("July seventh month");
        }
        else if(numberOfMonth == 8){
            System.out.println("August eighth month");
        }
        else if(numberOfMonth == 9){
            System.out.println("September the ninth month");
        }
        else if(numberOfMonth == 10){
            System.out.println("October tenth month");
        }
        else if(numberOfMonth == 11){
            System.out.println("November eleventh month");
        }
        else if(numberOfMonth == 12){
            System.out.println("December twelfth month");
        }
        else {
            System.out.println("This month does not exist");
        }
    }
}
