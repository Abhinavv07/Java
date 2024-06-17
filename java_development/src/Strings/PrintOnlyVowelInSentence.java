package Strings;

public class PrintOnlyVowelInSentence {
    public static void main(String args[])
    {
        String s = "He is a nice boy";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? " " : c);

        }
    }
}
