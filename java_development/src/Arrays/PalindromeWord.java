package Arrays;

import java.util.Scanner;

public class PalindromeWord
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];

        for(int i = 0 ; i < arr.length; i++)
        {

            System.out.println("Enter word");
            arr[i] = sc.next();
        }

        for(int i = 0; i < arr.length; i++)
        {
            String w = arr[i];
           if (isPalindromeWord(w))
           {
               System.out.println(arr[i]);
           }
        }

    }
    public static boolean isPalindromeWord(String s)
    {
      String temp = "";
      for(int i = s.length()-1; i >= 0; i--)
      {
          char ch = s.charAt(i);
          temp += ch;
      }
      return temp.equalsIgnoreCase(s.trim());
    }
}
