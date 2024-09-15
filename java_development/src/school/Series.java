package school;
public class Series {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i <= 32; i+=4)
        {   sum += i - (i+2);
            System.out.print(i + "-" + (i+2) + ",");
        }
        System.out.println("\nSum :- " + sum);
    }
}
