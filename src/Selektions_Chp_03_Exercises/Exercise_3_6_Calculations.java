package Selektions_Chp_03_Exercises;


//TODO Noget galt med udregningen af bmi

import java.util.Scanner;

public class Exercise_3_6_Calculations {

    public static void BMI(){

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in Feet
        System.out.print("Enter height in Feet: ");
        double height = input.nextDouble();

        // Prompt the user to enter inches
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        final double PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant
        final double FEET = 0.0833333;

        // Compute BMI
        double weightInpounds = weight;
        double heightInFeet = height;
        double andInches = inches;
        double bmi = (weightInpounds) / ((heightInFeet * heightInFeet))* andInches;

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");


    }
}
