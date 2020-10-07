package Selektions_Chp_03_Exercises;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Exercise_3_1_Calculations {

    public static void quadraticEquations(){

        Scanner input = new Scanner(System.in);

        //Promt the user to enter 3 numbers one for a,b and c

        System.out.println("Please enter value for a");

        double a = input.nextDouble();

        System.out.println("Please enter a value for b");

        double b = input.nextDouble();

        System.out.println("Please enter a value for c");

        double c = input.nextDouble();

        double d = sqrt((pow(b,2)-4 * a * c));

        double root1 = ((-b + sqrt(pow(b,2)-4 * a * c)) / ( 2 * a));

        double root2 = ((-b - sqrt(pow(b,2)-4 * a * c)) / ( 2 * a));

        //Calculation of the quadratic equations

        if ( d > 0 ) {
            System.out.println("The equation has two roots " + root1 +"   " + root2 );

        } else if ( d == 0 ) {
            System.out.println("The equation has one true root " + root1 + "   " + root2 );
        } else
        System.out.println("The equation has no real roots");







    }
}
