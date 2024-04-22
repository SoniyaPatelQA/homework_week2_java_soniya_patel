package homework_Week2;

import java.util.Scanner;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Programme19lowercase {

    public void uppercaseToLowercase(String str) {
        String result = str.toLowerCase();
        System.out.println(result);  //Output: the quick brown fox jumps over the lazy dog.
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string in uppercase: "); //e.g. THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        String str = scn.nextLine();

        Programme19lowercase obj = new Programme19lowercase();
        obj.uppercaseToLowercase(str);
    }
}
