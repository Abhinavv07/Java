package school;

import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter sentence");
        String s = inp.nextLine();

        int sp = 0, sc = 0, l = 0, dig = 0, sml = 0, cap = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) cap++;
            else if (Character.isLowerCase(c)) sml++;
            else if (Character.isWhitespace(c)) sp++;
            else if (Character.isDigit(c)) dig++;
            else if (Character.isLetter(c)) l++;
            else sc++;

        }
        System.out.println("Capitals : " + cap);
        System.out.println("Smalls : " + sml);
        System.out.println("Spaces : " + sp);
        System.out.println("Digits : " + dig);
        System.out.println("Letters : " + l);
        System.out.println("Special Characters : " + sc);
    }
}
