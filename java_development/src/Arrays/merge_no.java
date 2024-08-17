package Arrays;

import java.util.*;
//Merging no1 and no2 in no[]
class merge_no {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 0, nctr = 0;
        int no1[] = new int[3];
        int no2[] = new int[4];
        int no[] = new int[no1.length + no2.length];
        for (n1 = 0; n1 < no1.length; n1++) {
            System.out.print("Enter a no:-");
            no1[n1] = input.nextInt();
        }
        for (n2 = 0; n2 < no2.length; n2++) {
            System.out.print("Enter a no:-");
            no2[n2] = input.nextInt();
        }

        //Merging both in no[]
        int ctr1 = 0, ctr2 = 0;
        for (nctr = 0; nctr < (no1.length + no2.length); nctr++) {
            if (nctr < n1)
                no[nctr] = no1[ctr1++];
            else
                no[nctr] = no2[ctr2++];
        }
        for (nctr = 0; nctr < no.length; nctr++) {
            if (no[nctr] > 99 && no[nctr] < 1000)
                System.out.print(no[nctr] + " ");
        }
    }
}
