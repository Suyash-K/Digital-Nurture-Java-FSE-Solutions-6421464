public class MathUtils {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;  // throws ArithmeticException if b == 0
    }
}