package Arrays._2DArrays;

import java.util.Scanner;

public class FirstProgram
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows");
        int r = sc.nextInt();
        System.out.println("Enter no of columns");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        int i,j;
        for( i = 0; i < r; i++)
        {
            for( j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for( i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
