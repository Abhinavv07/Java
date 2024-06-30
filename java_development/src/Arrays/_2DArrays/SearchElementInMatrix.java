package Arrays._2DArrays;

import java.math.BigInteger;
import java.util.Scanner;

public class SearchElementInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //Printing
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //searching

        System.out.println("Enter number to search");
        int key = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at " + "(" + i + "," + j + ")");
                    // break;
                }
            }
        }
    }
}
