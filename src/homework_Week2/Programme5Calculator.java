package homework_Week2;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Programme5Calculator {

    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " = " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("subtraction of " + a + " and " + b + " = " + result);
    }

    public static void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of " + a + " and "+ b + " = " + result);
    }

    public static void division(int a, int b) {
        int result = a / b;
        System.out.println("division of " + a + " and " + b + " = " + result);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = scn.nextInt();
        System.out.print("Enter Second number: ");
        int b = scn.nextInt();

        Programme5Calculator obj = new Programme5Calculator();
        //calling instance methods
        obj.addition(a, b);
        obj.subtraction(a, b);
        //calling static methods
        multiply(a, b);
        division(a, b);
    }
}
