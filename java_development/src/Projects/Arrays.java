package Projects;

import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements -> ");
        int n = sc.nextInt();

        int arr[] = new int[n];//Array

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element");
            System.out.print("↪ ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements are :- ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMENU");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter 1 to sort array using bubble sort");
        System.out.println("Enter 2 to sort array using selection sort");
        System.out.print("⇒ ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bubbleSort(arr);
                System.out.println();
                break;
            case 2:
                selectionSort(arr);
                System.out.println();
                break;

            default:
                System.out.println("Invalid choice ");
                System.out.println("Exiting ...........");
                sc.close();

        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Do you want to continue with searching ?? Type yes or no");
        System.out.print("-> ");
        String c = sc.next();

        if (c.equalsIgnoreCase("yes")) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("Enter the element to be searched :- ");
            int target = sc.nextInt();
            System.out.println("Enter 1 to search element using linear search");
            System.out.println("Enter 2 to search element using binary search");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    linearSearch(arr, target);
                    break;

                case 2:
                    binarySearch(arr, target);
                default:
                    System.out.println("Wrong choice entered");
                    sc.close();
                    System.exit(0);

            }
        } else {
            System.out.println("Exiting...........");
        }

    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted array :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void linearSearch(int arr[], int target) {
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                idx = i;
                break;
            }
        }
        if (idx == -1) System.out.println("Element not found");
        else System.out.println("Element found at " + idx + " index");

    }

    public static void binarySearch(int[] arr, int target) {
        int mid, end, start;
        mid = start = end = 0;//initialisation
        end = arr.length - 1;

        int idx = -1;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == target) {
                idx = mid;
                break;
            } else if (arr[mid] < target) {
                end = mid + 1;

            } else {
                start = mid - 1;
            }
        }

        if (idx == -1) System.out.println("Element not found");
        else System.out.println("Element found at index " + idx);

    }


}

