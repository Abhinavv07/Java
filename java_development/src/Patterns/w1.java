package Patterns;

public class w1 {
    public static void main(String[] args) {
        String s = "CEGIK";
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = 0; j < i + 1; j++)
            {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }
    }
}
