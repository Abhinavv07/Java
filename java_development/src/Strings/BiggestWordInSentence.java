package Strings;

public class BiggestWordInSentence {
    public static void main(String[] args) {
        String s = "He is a communist";
        s = s + " ";
        String wd = "", wl = "";
        int p = 0, le, li = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                wd = s.substring(p, i);
                p = i + 1;
            }

            le = wd.length();
            if (li < le) {
                le = li;
                wl = wd;
            }

        }
        System.out.println("Biggest word:- " + wl);
    }
}
