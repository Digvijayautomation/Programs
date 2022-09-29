package Programs;

import java.util.HashMap;

public class Interview_occurance_of_character {

    public static void main(String[] args) {

                String str = "peterpatter";

                HashMap<Character, Integer> hMap = new HashMap<>();

                for (int i =0; i< str.length(); i++)
                {
                    if (hMap.containsKey(str.charAt(i))) // to check the character already present in hashmap
                      {
                        int count = hMap.get(str.charAt(i));  // if the character already present then get the count
                        hMap.put(str.charAt(i), ++count);     // and increase the count by 1
                    }
                    else {

                        hMap.put(str.charAt(i),1); // if the character is not already present in the hashmap add it with count 1
                    }
                }
                System.out.println(hMap);
            }
        }


