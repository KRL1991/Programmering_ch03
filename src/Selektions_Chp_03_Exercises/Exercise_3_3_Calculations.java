package Selektions_Chp_03_Exercises;

import java.util.Scanner;

public class Exercise_3_3_Calculations {

    public static void Algebra(){
// Create Scanner input

        Scanner input = new Scanner(System.in);

        // Promt the user to enter a, b, c , d, e and f

        System.out.println(" Pleaser enter: a, b, c , d, e and f ");
        System.out.println(" Please enter a");
        double a = input.nextDouble();

        System.out.println(" Please enter b");
        double b = input.nextDouble();

        System.out.println(" Please enter c");
        double c = input.nextDouble();

        System.out.println(" Please enter d");
        double d = input.nextDouble();

        System.out.println(" Please enter e");
        double e = input.nextDouble();

        System.out.println(" Please enter f");
        double f = input.nextDouble();

        System.out.println(" Please enter b");

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f ) - (e * c)) / (( a * d) - ( b * c));

        // Compute result

        double e1 = (a * x) + (b * y);
        double f1 = (c * x) + (d * y);

        if ((a * d) - (b * c) < 0) {
            System.out.println("X is: " + x + " and y is: " + y);

        } else System.out.println(" The Equation Has No Solution");





    }
}
