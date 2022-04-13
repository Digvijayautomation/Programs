package Programs;

public class largest_of_3_numbers {


    public static void main(String[] args) {


        int a=90;
        int b=40;
        int c=70;


        if(a>b && a>c)
        {
            System.out.println("A is Largest");
        }

        else if(b>c)
        {
            System.out.println("B is Largest");
        }
        else
        {
            System.out.println("C is Largest");
        }

    }
}
