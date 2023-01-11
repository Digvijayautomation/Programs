

import java.util.HashMap;

public class Interview_Multiplication_Int_with_String_Wipro {

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};

        HashMap map = new HashMap();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);


        int a = numbers[3];
        System.out.println(a);


        int b = (int) map.get("two");
        System.out.println(b);

        int multiplication_a_b = a * b;
        System.out.println("Multi of int 4 and String two is " +multiplication_a_b);
    }
}
