package Arrays;

import java.util.Scanner;

public class VC
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        int i;
        for(i= 0; i < arr.length; i++)
        {
            System.out.println("Enter word");
            arr[i] = sc.next();
        }

        System.out.println("word having vowel and consonant equal are ->  ");
        for (i = 0; i < arr.length;i++)
        {
            String wo = arr[i];
            if(isHavingVowelConsonantEqual(wo))
                System.out.print(arr[i] + ",");
        }
    }

    public static boolean isHavingVowelConsonantEqual(String s)
    {
        int v = 0, c = 0;
        char ch;
        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);

            if(ch == 'a' || c == 'e' || c == 'i' ||c == 'o' || c == 'u')
                v++;
            else
                c++;
        }
        return v == c;
    }
}
