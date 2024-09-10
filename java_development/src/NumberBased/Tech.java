package NumberBased;
import java.util.Scanner;
public class Tech
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int nod = (int)Math.log10(n) + 1;

        if(nod % 2 == 0)
        {
            int num = n;
           int h1 = num / (int) Math.pow(10,(nod/2));
           int h2 = num % (int) Math.pow(10,(nod/2));
           int sum = h1+h2;
           if(n == (int)Math.pow(sum,2))
               System.out.println("Tech");
           else
               System.out.println("Not");
        }
        else
            System.out.println("Not lol");

    }
}
