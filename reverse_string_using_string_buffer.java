package Programs;

import java.util.Scanner;

public class reverse_string_using_string_buffer {

    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        StringBuffer buffer=new StringBuffer(str);

        buffer.reverse();
        System.out.println("Reversed String Is" +buffer);

    }
}
