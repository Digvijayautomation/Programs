package Programs;

public class Interview_Reversing_Integer {

    public static void main(String[] args) {


        int number = 123;
        int reverse = 0;
        int remainder=0;


        while(number != 0)
        {
            remainder = number % 10; // 1st Iteration- 0 =123 % 10 = 3    // 2nd Iteration  0= 12 %10=2
            reverse = reverse * 10 + remainder;  //  1st Iteration 0 * 10 + 3 = 3   // 2nd Iteration 3 *10 +2= 32
            number = number/10; //  1st Iteration 123/10 =1  // 2nd Iteration  12/10=12
        }
        System.out.println("The reverse of the given number is: " + reverse);


    }
    }

