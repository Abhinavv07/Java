package ABHINAV;

public class FUNCTIONS {
    public String reverseString(String s) {
        String temp = "";
        for(int i = s.length()-1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return temp;
    }
    public static void main(String[] args) {
         FUNCTIONS F = new FUNCTIONS();
    }

}
