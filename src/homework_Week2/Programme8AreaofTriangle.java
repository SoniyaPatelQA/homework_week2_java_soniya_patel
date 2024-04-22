package homework_Week2;

import java.util.Scanner;

/**
 * 8. Write a program to calculate the area of a triangle.
 */

public class Programme8AreaofTriangle {

    public void areaofTriangle(float b,float h){
        float result = (b*h)/2;
        System.out.println("Area of Triangle for base '"+b+"' and height '"+h+"' = "+result);

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter base value: ");
        float b = scn.nextFloat();
        System.out.print("Enter height value: ");
        float h = scn.nextFloat();

        Programme8AreaofTriangle obj = new Programme8AreaofTriangle();
        obj.areaofTriangle(b,h);



    }
}
