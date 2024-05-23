package Patterns;

public class CircularPattern
{
    public static void main(String []args)
    {
        int n = 5;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 3)
                    System.out.print(j);
                else if (j == 3)
                    System.out.println(i);
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
