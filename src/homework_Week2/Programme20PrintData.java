package homework_Week2;

import java.util.Scanner;

/**
 * 20. Write a Java Program to print as below.
 * "+------------------------+"
 * "|                        |"
 * "|       CORNER STORE     |"
 * "|                        |"
 * "| 2015-03-29    04:38PM  |"
 * "|                        |"
 * "| Gallons:       10.870  |"
 * "| Price/gallon: $ 2.089  |"
 * "|                        |"
 * "| Fuel total: $ 22.71    |"
 * "|                        |"
 * "+------------------------+"
 */

public class Programme20PrintData {

    public static void printData(String title, String date, String time, double gValue, double gPRice, float fTotal) {

        System.out.println("''+------------------------+''");
        System.out.println("''|                        |''");
        System.out.println("''|       " + title + "     |''");
        System.out.println("''|                        |''");
        System.out.println("''|  " + date + "  " + time + "   |''");
        System.out.println("''|                        |''");
        System.out.println("''| Gallons:       " + gValue + "   |''");
        System.out.println("''| Price/gallon: " + "$ " + gPRice + "  |''");
        System.out.println("''|                        |''");
        System.out.println("''| Fuel total:  " + "$ " + fTotal + "   |''");
        System.out.println("''|                        |''");
        System.out.println("''+------------------------+''");

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter title: ");  //e.g CORNER STORE
        String title = scn.nextLine();
        System.out.print("Enter date: ");  //e.g. 2015-03-29
        String date = scn.nextLine();
        System.out.print("Enter time: ");  //e.g 04:38PM
        String time = scn.nextLine();
        System.out.print("Enter gallons value: ");  //e.g. 10.870
        double gValue = scn.nextDouble();
        System.out.print("Enter gallons price: ");  //e.g 2.089
        double gPrice = scn.nextDouble();
        System.out.print("Enter fuel total: ");  //e.g. 22.71
        float fTotal = scn.nextFloat();

        printData(title, date, time, gValue, gPrice, fTotal);


    }
}
