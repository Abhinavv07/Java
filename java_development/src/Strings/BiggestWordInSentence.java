package Strings;

public class BiggestWordInSentence {
    public static void main(String[] args) {
        String s = "He is a communist";
        s = s + " ";
        String wd = "", wl = "";
        String v = "",c = "";
        int p = 0, le, li = 0;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);

            if (c1 == ' ') {
                wd = s.substring(p, i);
                p = i + 1;
            }

            for(int j = 0; j < wd.length();j++)
            {
                char ch = wd.charAt(j);
                if ("aeiouAEIOU".indexOf(ch) != ch) {
                    c += ch;
                } else {
                    v += ch;
                }
            }

        }
        System.out.println(v.concat(c));

    }
}
