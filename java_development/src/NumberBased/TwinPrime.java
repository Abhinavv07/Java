package NumberBased;

import java.util.Scanner;

public class TwinPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (isTwinPrime(arr[i], arr[i + 1]))
                System.out.println(arr[i] + "," + arr[i + 1] + " are twin prime");
            else
                System.out.println(arr[i] + "," + arr[i + 1] + " are not twin prime");
        }

    }

    public static boolean isPrime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTwinPrime(int n1, int n2) {
        if (isPrime(n1) && isPrime(n2) && n2 - n1 == 2)
            return true;
        else
            return false;
    }
}

