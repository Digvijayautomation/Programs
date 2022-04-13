package Programs;

public class Swap_two_numbers {

    public static void main(String[] args) {

        int a=10;
        int b=34;


        System.out.println("Swapping using temp variable");
        System.out.println("Before Swapping");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        int temp;
        temp=a; // Assigned a to temp
        a=b;   // assignd b to a
        b=temp; // assigned temp i.e value of a to b

        System.out.println("After Swapping");
        System.out.println("a is "+a);
        System.out.println("b is "+b);

        System.out.println("************Ends Here**********************");

        System.out.println("Swapping without using any temp variable");

        int a1=50;
        int b2=80 ;
        System.out.println("Before Swapping");
        System.out.println("a1 is "+a1);
        System.out.println("b2 is "+b2);
         a1=a1-b2; // here a1 become 50-80=-30
         b2=a1+b2; //here b2 become  -30-80=50
         a1=b2-a1;  //here a1 Become 50+-30=80



        System.out.println("After Swapping");
        System.out.println("a1 is "+a1);
        System.out.println("b2 is "+b2);


    }
}
