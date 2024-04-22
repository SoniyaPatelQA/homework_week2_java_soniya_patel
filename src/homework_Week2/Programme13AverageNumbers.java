package homework_Week2;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input
 * to calculate and print the average of the numbers.
 */
public class Programme13AverageNumbers {

    public void averagenums(int a, int b, int c) {
        int result = (a + b + c) / 3;
        System.out.println("Average of " + a + ", " + b + " and " + c + " = " + result);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scn.nextInt();
        System.out.print("Enter second number: ");
        int b = scn.nextInt();
        System.out.print("Enter third number: ");
        int c = scn.nextInt();

        Programme13AverageNumbers obj = new Programme13AverageNumbers();
        obj.averagenums(a, b, c);
    }
}
