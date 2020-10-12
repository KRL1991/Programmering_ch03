package Selektions_Chp_03_Exercises;

import java.util.Scanner;

public class Exercise_3_7_Calculations {

    public static void financialApplication() {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;


        //Display the amount in Dollars, Quarters, Dimes , Nickles and Pennies
        if (numberOfOneDollars == 1)

            System.out.println("Your amount" + amount + "consists of");
        if (numberOfOneDollars > 0) {
            if (numberOfOneDollars == 1)
                System.out.print(numberOfOneDollars + " dollar");
            else
                System.out.print(numberOfOneDollars + " dollars");
        }

        if (numberOfQuarters > 0) {
            if (numberOfQuarters == 1)
                System.out.print(" and " + numberOfQuarters + " quarter");
            else
                System.out.print(" and " + numberOfQuarters + " quarters");
        }

        if (numberOfDimes > 0) {
            if (numberOfDimes == 1)
                System.out.print(" and " + numberOfDimes + " dime");
            else
                System.out.print(" and " + numberOfDimes + " dimes");
        }

        if (numberOfNickels > 0) {
            if (numberOfNickels == 1)
                System.out.print(" and " + numberOfNickels + " dime");
            else
                System.out.print(" and " + numberOfNickels + " dimes");
        }

        if (numberOfPennies > 0) {
            if (numberOfPennies == 1)
                System.out.print(" and " + numberOfPennies + " penny");
            else
                System.out.print(" and " + numberOfPennies + " pennies");

        }
    }
}
