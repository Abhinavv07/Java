package NumberBased;
import java.util.Scanner;
public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter element");
        int p = 0,ne = 0, z = 0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] > 0)
                p++;
            else if(arr[i] < 0)
                ne++;
            else
                z++;
        }
        System.out.println(p + " positive numbers");
        System.out.println(ne + " negative numbers");
        System.out.println(z + " zeros");
    }
}
