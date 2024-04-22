package homework_Week2;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 *      Input Data:
 *              Input a Decimal Number : 5
 *      Expected Output
 *             Binary number is: 101
 */
public class Programme17DecimaltoBinary {

    public void decimalToBinary(int num) {
        String binNum = Integer.toBinaryString(num);
        System.out.println("Binary number is: " + binNum); //output: 101
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");  //e.g. decimal value:5
        int num = scn.nextInt();

        Programme17DecimaltoBinary obj = new Programme17DecimaltoBinary();
        obj.decimalToBinary(num);
    }

}
