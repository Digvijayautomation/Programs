package Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interview {

    // Extract Numbers From Given String And Add Them
    public static void main(String[] args) {


        String str = "abc22def42ghi123";
       int sum = 0;

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        while(((Matcher) m).find()) {
            System.out.println(m.group());





    }
}}
