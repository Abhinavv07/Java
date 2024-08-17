package Arrays;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long number = sc.nextLong();


        int[] frequency = new int[10];

        while (number != 0) {
            int digit = (int) number % 10;
            frequency[digit]++;
            number /= 10;
        }


        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + frequency[i]);
        }


    }
}

