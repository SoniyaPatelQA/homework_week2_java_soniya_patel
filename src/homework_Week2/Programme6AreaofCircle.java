package homework_Week2;

/**
 * 6. Write a program to enter any radius value of the circle and
 * find out the area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Programme6AreaofCircle {

    public void areaofCircle(float r){
        float pi = 3.14f;
        float area = pi *r*r;
        System.out.println("Area of radius "+r+" = "+area);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Circle Radius: ");
        float r = scn.nextFloat();
        Programme6AreaofCircle obj = new Programme6AreaofCircle();
        obj.areaofCircle(r);
    }
}
