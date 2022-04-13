package Programs;

import java.util.Scanner;

public class number_is_positve_negative {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number to check whether it is positive or negative");
        double number=sc.nextDouble();

        if(number>0)
        {
            System.out.println("Entered Number Is Positive");
        }
        else if(number<0)
        {
            System.out.println("Entered Number Is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }

    }
}
