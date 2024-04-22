package homework_Week2;

/**
 * 11. Write a Java program to display the following pattern.
 * Sample Pattern :
 *      J a v v a
 *      J a a v v a a
 *      J J aaaaa V V aaaaa
 *      J J a a V a a
 */

public class Programme11Pattern {

    public void pattern(){
        System.out.println("J a v v a");
        System.out.println("J a a v v a a");
        System.out.println("J J aaaaa V V aaaaa");
        System.out.println("J J a a V a a");
    }

    public static void main(String[] args) {
        Programme11Pattern obj = new Programme11Pattern();
        obj.pattern();
    }
}
