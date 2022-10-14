package Programs;

import java.util.HashMap;
import java.util.HashSet;

public class Interview_occurance_of_character {

    public static void main(String[] args) {


        String str = "SSDRRRTTYYTYTR";

        HashMap <Character, Integer> hMap = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            if (hMap.containsKey(str.charAt(i)))
            {
                int count = hMap.get(str.charAt(i));
                hMap.put(str.charAt(i), ++count);
            }
            else
            {
                hMap.put(str.charAt(i),1);
            }
        }
        System.out.println(hMap);



    }
}






