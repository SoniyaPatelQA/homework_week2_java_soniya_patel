package homework_Week2;

/**
 * 12. Write a Java program to compute the specified expressions and print the output.
 *      Test Data:
 *          ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 *      Expected Output : 2.138888888888889
 */
public class Programme12ComputeExpression {

    public static void computeExpression() {
        double a = 25.5, b = 3.5, c = 40.5, d = 4.5;
        double result = (a * b - b * b) / (c - d);
        System.out.println(result);
    }

    public static void main(String[] args) {
        computeExpression();
    }
}
