package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Largest_in_array {

    public static void main(String[] args) {

        int [] numbers={3,1,4,67,45,6};

        int l=numbers.length; // find the length

        Arrays.sort(numbers); // sorting the array smaller to grater

        System.out.println(numbers[l-1]); // l-1 because length is 6 but index for 6 will be 5 i.e i-1
    }



}
