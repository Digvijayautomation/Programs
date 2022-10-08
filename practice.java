package Programs;

import java.util.HashMap;

public class practice {
    public static void main(String[] args) {


        String str="Digvijaytikka";

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {

            if(map.containsKey(str.charAt(i)))
            {
                int count=map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }
            else
            {
                map.put(str.charAt(i),1);
            }



        }
        System.out.println(map);

    }


    }










