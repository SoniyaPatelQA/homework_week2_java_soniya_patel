package homework_Week2;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables.
 */

public class Programme15SwapNumbers {

    public void swapNumbers(int num1, int num2) {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping: num1 = " + num1 + ", num2 = " + num2);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = scn.nextInt();
        System.out.print("Enter number2: ");
        int num2 = scn.nextInt();
        System.out.println("Before Swapping: num1 = " + num1 + ", num2 = " + num2);

        Programme15SwapNumbers obj = new Programme15SwapNumbers();
        obj.swapNumbers(num1, num2);
    }
}
