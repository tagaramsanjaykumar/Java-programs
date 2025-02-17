import java.util.Scanner;
import java.lang.ArithmeticException;

public class Exceptions {
    public static void main(String[] args) {
        int numerator;
        int denominator;
        Scanner sc = new Scanner(System.in);
        numerator = sc.nextInt();
        denominator = sc.nextInt();
        try {

            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
