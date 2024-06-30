package school;

public class Pattern {
    public static void main(String[] args) {
        String s = "EXAMINATION";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i, s.length() - i));
        }
    }
}
