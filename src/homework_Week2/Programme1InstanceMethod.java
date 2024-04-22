package homework_Week2;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Programme1InstanceMethod {

    //instance variables
    int a = 10, b = 20;

    //instance method
    public void m1() {

        //calling instance variables
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        //calling instance method
        Programme1InstanceMethod obj = new Programme1InstanceMethod();
        obj.m1();
    }

}
