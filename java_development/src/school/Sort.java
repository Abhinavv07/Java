package school;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (n >= 4 && n <= 10) {
            for (int i = 0; i < arr.length; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }

                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            System.out.println("Sorted array : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Program ended");
        }
    }
}
