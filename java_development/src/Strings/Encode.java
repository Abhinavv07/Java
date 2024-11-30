package Strings;

public class Encode {
    public static void main(String[] args) {
        String s = "xyzABC";
        String st = "";
        int nav;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                nav = ch - 3;
                if (nav < 'A') {
                    nav += 26;
                }
            } else if (Character.isLowerCase(ch)) {
                nav = ch - 3;
                if (nav < 'a') {
                    nav += 26;
                }
            } else {
                nav = ch;
            }
            st += (char) nav;
        }
        System.out.println(st);
    }
}
