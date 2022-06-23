package Programs;

import java.util.HashSet;
import java.util.Set;

public class Interview_How_to_remove_duplicate_string {

    public static void main(String[] args) {
        
             String s1="ALTIMATIK";

        Set<String> hash_Set = new HashSet<String>(); // we will use Set because set will only add unique values

        for (int i=0;i<s1.length();i++)
             {
                String temp="";
                temp+=s1.charAt(i);
                hash_Set.add(temp);
             }

        System.out.println(hash_Set);

    }
}
