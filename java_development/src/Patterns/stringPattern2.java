package Patterns;

public class stringPattern2
{
    public static void main(String []args)
    {
        String s = "ENCAPSULATION";
        for(int i = 0 ; i < s.length(); i++)
        {
            System.out.println(s.substring(i,s.length()-i));
        }
    }
}
