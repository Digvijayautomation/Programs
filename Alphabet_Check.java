package Programs;

import java.util.Scanner;

public class Alphabet_Check {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character check whether it is Alphabet or not");
        char ch=sc.next().charAt(0);

        if((ch>='a' && ch <='z') || (ch>='A' && ch <='Z') )
        {
            System.out.println("Enter Character is Alphabet");

        }
        else
        {
            System.out.println("Enter Character is NOT Alphabet");
        }



    }
}
