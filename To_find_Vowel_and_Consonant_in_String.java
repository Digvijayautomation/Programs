package Programs;

import java.util.Scanner;

public class To_find_Vowel_and_Consonant_in_String {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String To Check Number of Vowel and Consonant ");
        String str=  sc.next();
        System.out.println("Length of the String Is-"+str.length());


          char ch;
          int count_vowel=0;
          int count_consonant=0;

        for(int i=0;i<str.length();i++)
        {
           ch= str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                count_vowel++;
            }
            else
            {
                count_consonant++;
            }
        }
        System.out.println("Vowel In Given String is-"+count_vowel +" Consonant In Given String is- "+count_consonant);


    }
}
