package homework_Week2;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme7FahrenheittoCelsius {

    public void fahrenheittoCelsius(int temp){

        int result = (temp - 32)*5/9;
        System.out.println("fahrenheit temperature '"+temp+"' is converted to celsius = "+result+"°C");

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        int temp = scn.nextInt();

        Programme7FahrenheittoCelsius obj = new Programme7FahrenheittoCelsius();
        obj.fahrenheittoCelsius(temp);
    }
}
