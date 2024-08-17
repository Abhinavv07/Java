package Arrays;

public class wordConstruction {
    public static void main(String[] args) {
        String s = "lol is l0l";
        String[] sen = new String[s.length()];
        String wo = "";

        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                wo += s.charAt(i);
            } else {
                sen[k] = wo;
                k++;
                wo = "";
            }
            sen[k] = wo;
        }
        for (int i = 0; i < sen.length; i++) {
            String sw = sen[i];
            if (palindrome(sw)) System.out.println(sen[i]);
        }

    }
    public static boolean palindrome(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            s1 += ch;
        }
        return s.compareTo(s1) == 0;

    }
}
