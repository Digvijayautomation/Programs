package Programs;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        System.out.println("Enter The String To Reverse");
        Scanner sc=new Scanner(System.in);
        String str1= sc.next();

        String rev="";
        char t;

        String temp="";
        for(int i=0;i<str1.length();i++)
        {
       t=str1.charAt(i);
       rev=t+rev;

        }
        System.out.println();


    }
}
