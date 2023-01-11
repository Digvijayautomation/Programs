

import java.util.Scanner;

public class palindrone_string {

    public static void main(String[] args) {
        String rev="";
        char t;


        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        for(int i=0;i<str.length();i++)
        {
            t = str.charAt(i);
            rev =t + rev;
        }
        System.out.println("Reverse for /t" +str+ "is /t" +rev);

        if(str.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrone");
        }

    }
}
