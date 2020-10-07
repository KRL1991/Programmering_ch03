package Selektions_Chp_03;

import java.awt.*;

public class Selections {

    public static void main(String[] args) {

        int hourTime = 0;
        int minute = 57;


        // if
        if (hourTime >= 9 && hourTime < 15) {

            System.out.println("Du er i skole");
        } else {
            System.out.println(" Du er ikke i skole");
        }

        if (hourTime == 0) System.out.println(" Det er midnat");

        //switch

        String color = "Red";

        switch (color) {
            case "Red":
                System.out.println(" A red sports car ");
                break;
            case "Green":
                System.out.println(" A green off roader");
                break;
            default:
                System.out.println(" a random car ");

        }

        String x = "Red";
        String y = "Green";
        String random = " Random color";

        if (x == " Red ");
        if (y == " Green ");

        else
            System.out.println();

        System.out.println(" The car is ");



        }


    }