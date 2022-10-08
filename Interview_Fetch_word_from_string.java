package Programs;

public class Interview_Fetch_word_from_string {

    public static void main(String[] args) {


        String str = "Selenium Test Automation";

        System.out.println(str.indexOf("Test"));
        String str1 = str.substring(9,13);

        System.out.println(str1);

    }
}
