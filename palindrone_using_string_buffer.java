package Programs;

import java.util.Scanner;

public class palindrone_using_string_buffer {

        public static void main(String[] args) {

            System.out.println("Enter the String");
            Scanner sc=new Scanner(System.in);
            String str=sc.next();

            StringBuffer buffer=new StringBuffer(str);
            buffer.reverse();
            String buffer1=buffer.toString();



            if(str.equals(buffer1))
            {
                System.out.println("Given String Is Palindrone");
            }
            else
            {
                System.out.println("Given String Is Not Palindrone");
            }
        }
    }


