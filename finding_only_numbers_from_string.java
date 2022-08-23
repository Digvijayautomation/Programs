package Programs;

import java.util.ArrayList;

public class finding_only_numbers_from_string {

    public static void main(String[] args) {


        String str="digvijay@1992";
      str = str.replaceAll("[^\\d]", "");
        System.out.println(str);




    }
}
