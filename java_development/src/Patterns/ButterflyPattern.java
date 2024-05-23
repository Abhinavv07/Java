package Patterns;

public class ButterflyPattern
{
    public static void main(String[] args)
    {
      int n = 5;

      for(int i = 1; i <= 5; i++)
      {
          for(int j = 1; j <= i; j++)
        {
             if (j != i)
                System.out.print(" ");
             else
                 System.out.print(j);
          }
          for(int k = n; k >= 1; k--)
          {
              if (k != i)
                  System.out.print(" ");
              else
                  System.out.print(k);
          }
          System.out.println();
      }
    }
}
