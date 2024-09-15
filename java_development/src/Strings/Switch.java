package Strings;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sen = sc.nextLine();

        System.out.println("\t\t\t\tMenu");
        System.out.println("Input\t\t\t\t\t\tOutput");
        System.out.println("1.\t\t\t\t\t\tTo encode characters by -2");
        System.out.println("2.\t\t\t\t\t\tTo print vowel then consonant");
        System.out.println("3.\t\t\t\t\t\tConvert capitals to small");

        System.out.println("Enter choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(encode(sen));
                break;
            case 2:
                System.out.println(vowel(sen));
                break;
            case 3:
                System.out.println(capSml(sen));
                break;
            default:
                System.out.println("Wrong choice");

        }

    }

    public static String encode(String s) {
        String enc = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch1 = (char) (ch - 2);
            if ((int) ch1 < 65) {
                char ch2 = (char) (90 - 1);
                enc += ch2;
            } else {
                enc += ch1;
            }
        }
        return enc;
    }

    public static String vowel(String s) {
        String v = "", c = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != ch) {
                c += ch;
            } else {
                v += ch;
            }
        }
        return v.concat(c);
    }

    public static String capSml(String s) {
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                Character.toLowerCase(ch);
                s2 += ch;
            }
            if (Character.isLowerCase(ch)) {
                Character.toUpperCase(ch);
                s2 += ch;
            }
        }
        return s2;
    }
}