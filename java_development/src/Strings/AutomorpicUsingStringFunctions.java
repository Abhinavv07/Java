package Strings;

public class AutomorpicUsingStringFunctions {
    public static void main(String[] args) {
        int n = 25;
        String  s1 = String.valueOf(n);
        String s2 = String.valueOf(n*n);
        if(s2.endsWith(s1)) {
            System.out.println("Automorphic");
        }
        else {
            System.out.println("not");
        }
    }
}
