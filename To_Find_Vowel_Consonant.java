package Programs;

import java.util.Scanner;

public class To_Find_Vowel_Consonant {

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);

        System.out.println("Enter character to check whether it is Vowel or Consonant ");
         char ch=sc.next().charAt(0);



       if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
       {
           System.out.println("Entered Character Is Vowel");
       }
       else
       {
           System.out.println("Character Is Consonant");
       }
    }
}
