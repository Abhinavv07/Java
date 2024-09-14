package ExceptionHandeling;

import java.io.*;
import java.util.*;

public class e1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter number :- ");
            int n = sc.nextInt();
            double res = 100 / n;

            if (n == 0)
                throw new ArithmeticException();
            else
                System.out.println("Result :- " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error :- " + e.getMessage());
        } finally {
            System.out.println("This code will execute by neglecting the error (finally block)");
        }
    }
}
