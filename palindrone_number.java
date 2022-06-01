package Programs;

import java.util.Scanner;

public class palindrone_number {

    public static void main(String[] args) {
        int sum=0;

        System.out.println("Enter the Number");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

      while (num>0)
      {
          int r=num%10;
           sum=(sum*10)+r;
           num=num/10;
      }
      if (num==sum)
      {
          System.out.println("Number is palindrone");
      }
else
      {
          System.out.println("Number is not palindrome");
      }


    }
}
