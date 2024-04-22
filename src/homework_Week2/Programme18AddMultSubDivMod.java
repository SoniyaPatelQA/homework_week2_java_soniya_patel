package homework_Week2;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 *      Test Data:
 *          Input first number: 125
 *          Input second number: 24
 *       Expected Output :
 *       125 + 24 = 149
 *       125 - 24 = 101
 *       125 x 24 = 3000
 *       125 / 24 = 5
 *       125 mod 24 = 5
 */
public class Programme18AddMultSubDivMod {

    public void calcofNumbers(int num1, int num2){

        int addition = num1+num2;
        int subtract = num1- num2;
        int multiply = num1* num2;
        int divide = num1/num2;
        int remainder = num1 %num2;

        System.out.println(num1+" + "+num2+" = "+addition);
        System.out.println(num1+" - "+num2+" = "+subtract);
        System.out.println(num1+" x "+num2+" = "+multiply);
        System.out.println(num1+" / "+num2+" = "+divide);
        System.out.println(num1+" mod "+num2+" = "+remainder);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: "); //e.g. 125
        int num1 = scn.nextInt();
        System.out.print("Enter second number: "); //e.g. 24
        int num2 = scn.nextInt();

        Programme18AddMultSubDivMod obj = new Programme18AddMultSubDivMod();
        obj.calcofNumbers(num1, num2);

    }
}
