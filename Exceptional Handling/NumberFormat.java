public class ExceptionExample3 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // NumberFormatException
            int result = 10 / 0; // ArithmeticException
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
