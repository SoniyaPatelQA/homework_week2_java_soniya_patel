package homework_Week2;
/**
 * 9. Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Programme9UppercaseToLowercase {

    public void upperccaseToLowercase(String str){
        String result = str.toLowerCase();
        System.out.println("'"+str+"' is converted into lowercase: "+result);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any string into uppercase: ");  //e.g 'JAVA IS INDEPENDENT LANGUAGE'
        String str =scn.nextLine();

        Programme9UppercaseToLowercase obj = new Programme9UppercaseToLowercase();
        obj.upperccaseToLowercase(str);
    }
}
