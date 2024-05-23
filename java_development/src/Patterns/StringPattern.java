package Patterns;

public class StringPattern {
    public static void main(String[] args) {
        String word = "ENCAPSULATION";
        int sp = 40;
        for (int i = 0; i < word.length(); i += 2) {
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }

            System.out.println(word.substring(i));
            sp++;
        }

    }
}
