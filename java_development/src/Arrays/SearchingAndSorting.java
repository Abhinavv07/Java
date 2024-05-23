package Arrays;

import java.util.Scanner;

public class SearchingAndSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter value of n");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //searching
        System.out.println("\nEnter target");
        int tg = sc.nextInt();

        int high = arr.length - 1;
        int low = 0;
        int idx = -1;
        while (low <= high) {
            int mid = (high + low) / 2; // Corrected calculation of mid index

            if (arr[mid] == tg) {
                idx = mid;
                break;
            } else if (arr[mid] < tg) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (idx == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at " + (idx + 1));
    }
}
