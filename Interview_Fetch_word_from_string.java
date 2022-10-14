package Programs;

public class Interview_Fetch_word_from_string {

    public static void main(String[] args) {


        String str = "Selenium Test Automation";
        String find_string="Test";

        int length_of_find_string=find_string.length();

       int index_test=str.indexOf(find_string);

        String str1 = str.substring(index_test,13);

        System.out.println(str1);

    }
}
