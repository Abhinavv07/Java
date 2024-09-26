package Arrays._2DArrays;

import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("square matrix :: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //printing sum of left and right diagonal
        int rightDiagonalSum = 0, leftDiagonalSum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == i) //for left diagonal
                    leftDiagonalSum += arr[i][j];
                else rightDiagonalSum += arr[i][j];
            }
        }
        System.out.println("Sum of left diagonal = " + leftDiagonalSum);
        System.out.println("Sum of right diagonal = " + rightDiagonalSum);
    }
}
