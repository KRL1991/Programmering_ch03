package Selektions_Chp_03_Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_3_5_Calculations {

    public static void findFutureDay() {

        Scanner input = new Scanner(System.in);

        //Promt the user to enter a number for todays weekday Sunday is 0

        System.out.println("Please Enter Todays Weekday As A Number Between 0 and 6 (Sunday is 0, Monday is 1 ...");

        int todaysWeekday = input.nextInt();

        System.out.println(" Please Enter Days Elapsed Since Today");

        int elapsedDays = input.nextInt();

        int futureDay = todaysWeekday + elapsedDays % 7;

        switch (todaysWeekday) {

            case 0:
                System.out.print("Today is Sunday and");
                break;
            case 1:
                System.out.print("Today is Monday and");
                break;
            case 2:
                System.out.print("Today is Tuesday and");
                break;
            case 3:
                System.out.print("Today is Wednesday and");
                break;
            case 4:
                System.out.print("Today is Thursday and");
                break;
            case 5:
                System.out.print("Today is Friday and");
                break;
            case 6:
                System.out.print("Today is Saturday and");
                break;
        }
        switch (futureDay) {

            case 0:
                System.out.print(" the future day is Sunday.");
                break;
            case 1:
                System.out.print(" the future day is Monday.");
                break;
            case 2:
                System.out.print(" the future day is Tuesday.");
                break;
            case 3:
                System.out.print(" the future day is Wednesday.");
                break;
            case 4:
                System.out.print(" the future day is Thursday.");
                break;
            case 5:
                System.out.print(" the future day is Friday.");
                break;
            case 6:
                System.out.print(" the future day is Saturday.");
                break;


        }
    }
}
