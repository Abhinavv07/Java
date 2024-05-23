package Arrays;

import java.util.Scanner;

public class Perfect
{
    public static boolean isPerfect(int n)
    {
        int sumOfFactors = 0;
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sumOfFactors += i;
            }

        }
        return n == sumOfFactors;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < arr.length;i++)
        {
            System.out.println("Enter number");
            arr[i] = sc.nextInt();

        }
        for(int i = 0; i < arr.length; i++)
        {
            if(isPerfect(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
    }
}
