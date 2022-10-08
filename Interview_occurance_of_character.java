package Programs;

import java.util.HashMap;
import java.util.HashSet;

public class Interview_occurance_of_character {

    public static void main(String[] args) {

                String str = "peterpatter";
             HashSet set=new HashSet();

                for (int i =0; i< str.length(); i++)
                {
                    String temp="";
                    temp+=str.charAt(i);
                    set.add(temp);

                }
                System.out.println(set);
            }
        }


