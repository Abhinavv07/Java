package Strings;

import java.util.Scanner;

public class vowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        if (vowels(s.charAt(0)) && vowels(s.charAt(s.length() - 1))) {
            System.out.println("Yesssssss!!!!!");
        } else {
            System.out.println("noo");
        }


    }

    public static boolean vowels(char c) {
        if ("aeiouAEIOU".indexOf(c) == -1) {
            return false;
        }
        return true;
    }
}
