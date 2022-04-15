package Programs;

import java.util.Scanner;

public class to_check_gievn_number_is_in_array {

    public static void main(String[] args) {


        // Practice program 2
        System.out.println(" Find the Given Value of Day is present in array or not ");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number To Search In Array");
        int  num_to_search =sc.nextInt();

        int [] day={1,4,5,7,2};


        boolean IsInArray=false;


        for(float element:day) {
            if (num_to_search == element) {
                IsInArray = true;
                break;

            }
        }
        if(IsInArray)
        {
            System.out.println(+num_to_search+" \t Is On The Array List");
        }
        else
        {
            System.out.println(+num_to_search+" \tIs On Not In The Array List");
        }

        System.out.println("************|Ends Here|**********");

    }
}
