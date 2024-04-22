package homework_Week2;

import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 *      Test Data:
 *          Width = 5.5 Height = 8.5
 *      Expected Output:
 *          Area is 5.6 * 8.5 = 47.60
 *          Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programme14RectangleAreaPerimeter {

    public void rectangleAreaPerimeter(float w, float h) {
        float area = w * h;
        System.out.println("Area is " + w + " * " + h + " = " + area);
        float perimeter = 2 * (w + h);
        System.out.println("Perimeter is 2 * (" + w + " + " + h + ") = " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter width: ");
        float w = scn.nextFloat();
        System.out.print("Enter height: ");
        float h = scn.nextFloat();

        Programme14RectangleAreaPerimeter obj = new Programme14RectangleAreaPerimeter();
        obj.rectangleAreaPerimeter(w, h);
    }
}
