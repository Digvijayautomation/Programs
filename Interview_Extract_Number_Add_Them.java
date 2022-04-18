package Programs;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interview_Extract_Number_Add_Them {

    // Extract Numbers From Given String And Add Them
    public static void main(String[] args) {

        String str = "abc22def42ghi123";

        int sum = 0;
        int i =0;

        Pattern p = Pattern.compile("\\d+"); // Finding the numbers in given string
        Matcher m = p.matcher(str);

        int [] numbers = new int[str.length()];  //Initialized array to store numbers

        while(((Matcher) m).find())
        {
            numbers[i] = Integer.parseInt(m.group());

            System.out.println(numbers[i]);
            sum = sum + numbers[i];
            i++;


        }

        System.out.println("Sum Is- " + sum);
    }
}
