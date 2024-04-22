package homework_Week2;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme4StaticInstanceMethods {

    //instance  and static variables
    int a = 10, b = 30;
    static String str = "JAVA", str1 = "Python";

    //instance method
    public void m1() {
        // calling instance variables
        System.out.println(a);
        System.out.println(b);
        //calling static variables
        System.out.println(Programme4StaticInstanceMethods.str);
        System.out.println(Programme4StaticInstanceMethods.str1);
    }

    //static method
    public static void m2() {
        // calling instance variables
        Programme4StaticInstanceMethods obj = new Programme4StaticInstanceMethods();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //calling static variables
        System.out.println(str);
        System.out.println(str1);
    }

    public static void main(String[] args) {

        //calling instance method
        Programme4StaticInstanceMethods obj = new Programme4StaticInstanceMethods();
        obj.m1();
        System.out.println("---------------------------");
        m2(); //calling static method
    }
}
