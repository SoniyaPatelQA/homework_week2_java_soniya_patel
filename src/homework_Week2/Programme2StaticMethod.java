package homework_Week2;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Programme2StaticMethod {

    //static variables
    static String str1 = "Welcome";
    static String str2 = "JAVA";

    //static method
    public static void m1() {

        //calling static variables
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main(String[] args) {

        //calling static method
        Programme2StaticMethod.m1();
        //m1();
    }

}
