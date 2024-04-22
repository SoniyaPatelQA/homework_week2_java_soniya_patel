package homework_Week2;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3InstanceStaticMethod {

    //instance  and static variables
    int a = 10;
    static  String str = "JAVA";

    //instance method
    public void m1() {
        System.out.println(a);  // calling instance variable
        System.out.println(Programme3InstanceStaticMethod.str); //calling static variable
    }

    //static method
    public static void m2(){
        Programme3InstanceStaticMethod obj = new Programme3InstanceStaticMethod();
        System.out.println(obj.a);  // calling instance variable
        System.out.println(Programme3InstanceStaticMethod.str); //calling static variable
    }

    public static void main(String[] args) {

        //calling instance method
        Programme3InstanceStaticMethod obj = new Programme3InstanceStaticMethod();
        obj.m1();
        m2(); //calling static method
    }
}
