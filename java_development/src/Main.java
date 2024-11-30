public class Main {
    public static void main(String[] args) {

        int n = 341;
        System.out.println(reverse(n));
    }
    public static int reverse(int n) {
        int rev = 0;
        while(n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}