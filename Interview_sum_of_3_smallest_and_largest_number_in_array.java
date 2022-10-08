package Programs;

import java.util.Arrays;

public class Interview_sum_of_3_smallest_and_largest_number_in_array {

    public static void main(String[] args) {

        int[] a = {1, 7, 8, 3, 3, 4, 2, 6};

        Arrays.sort(a);
        int len = a.length;

        System.out.println("Length of Array-" + len);


        int min = 0;
        int max=0;

        for (int i = 0; i < 3; i++)
        {
             min = min + a[i];
        }

        for(int j=len-1; j>=len-3;j--) // len- 1 because length is 8 but indexes are 7
        {
            max=max+a[j];
        }

        System.out.println("Sum of 3 smallest number-" + min);
        System.out.println("Sum of 3 Largest number-" + max);


    }
}
