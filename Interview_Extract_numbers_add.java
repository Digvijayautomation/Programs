

public class Interview_Extract_numbers_add
{
    public static void main(String[] args) {

            String str = "dudu3kdjs7kdlskd8";

            int n= Integer.parseInt(str.replaceAll("[a-z]",""));

            System.out.println("Number is"+n);

        int sum=0;

            while (n != 0)
            {
                sum = sum + n % 10;
                n = n/10;
            }
            System.out.println("Sum Is"+sum);
        }

    }

