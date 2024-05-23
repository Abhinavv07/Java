package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class SimilarChar
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter word");
            arr[i] = sc.next();
            arr[i] = arr[i].toLowerCase();

        }
        for(int i = 0; i < arr.length; i++)
        {

            if(arr[i].charAt(0) == arr[i].charAt(arr[i].length()-1))
            {
                System.out.println(arr[i]);
            }
        }
    }
}
