package ExceptionHandeling;

import java.io.IOException;
import java.util.Scanner;

public class e1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number");
            int n = sc.nextInt();
            if (n == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            int r = 100 / n;
            System.out.println("Result :- " + r);

        } catch (ArithmeticException e) {
            System.out.println("Error - " + e.getMessage());
        } finally {
           System.exit(0);
        }

    }
}

