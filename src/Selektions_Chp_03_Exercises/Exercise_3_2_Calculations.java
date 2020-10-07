package Selektions_Chp_03_Exercises;

import java.util.Scanner;

public class Exercise_3_2_Calculations {

    public static void AdditionQuiz() {

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " * " + number2 + " * " + number3);

        int answer = input.nextInt();

        System.out.println(
                number1 + " * " + number2 + " * " + number3 + " is " + answer +
                        (number1 * number2 * number3 == answer));
    }
}