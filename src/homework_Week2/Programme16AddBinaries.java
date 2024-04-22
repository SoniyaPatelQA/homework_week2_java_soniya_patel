package homework_Week2;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 *          Input Data:
 *                Input first binary number: 10
 *                Input second binary number: 11
 *          Expected Output:
 *                Sum of two binary numbers: 101
 */

public class Programme16AddBinaries {

    public void addBinary(String  s1, String s2){

        int binarynum1 = Integer.parseInt(s1, 2);
        int binarynum2 = Integer.parseInt(s2, 2);

        int sum = binarynum1 + binarynum2;
        String  bianryresult = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: "+bianryresult); //result: 101
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first binary number: ");  //e.g 10
        String s1 = scn.nextLine();
        System.out.print("Enter second binary number: "); //e.g.11
        String s2 = scn.nextLine();

        Programme16AddBinaries obj = new Programme16AddBinaries();
        obj.addBinary(s1,s2);
    }
}
