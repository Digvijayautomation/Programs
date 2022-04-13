package Programs;

public class Find_count_of_capital_and_small_charactor_in_string {

    public static void main(String[] args) {


        String str= "DigvijayTikka";
        System.out.println("String Is \t" +str);

        String upper_char="";
        String lower_char="";
        int upper=0;
        int lower=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                upper_char=upper_char+ch;       // For Printing Upper Characters
                upper++;                        // For Print Count Off Upper Characters

            }
            else
            {
                lower_char=lower_char+ch;         // For Printing Upper Characters
                lower++;                           // For Print Count Off Upper Characters
            }

        }

        System.out.println("Upper Characters-\t"+upper_char);
        System.out.println("Lower Characters-\t"+lower_char);

        System.out.println("Upper Count-\t"+upper);
        System.out.println("Lower Count-\t"+lower);

    }
}
