package Arrays._2DArrays;

import java.util.Scanner;

public class PrintingSumOfRowsColumn {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows");
        int r = sc.nextInt();
        System.out.println("Enter no of columns");
        int c = sc.nextInt();

        int [][]arr = new int[r][c];

        int i,j;
        for( i = 0; i < r; i++)
        {
            for( j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
 //sum of rows
        for( i = 0; i < r; i++)
        {
            int rsum = 0;
            for(j = 0; j < c; j++)
            {
                rsum += arr[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " rows is ;- " + rsum );
        }

        //for columns

        for(i = 0; i < r; i++)
        {
            int csum = 0;
            for(j = 0; j < c; j++)
            {
                csum += arr[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column is ;- " + csum );
        }
    }
    }
