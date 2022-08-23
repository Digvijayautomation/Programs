package Programs;

import java.util.HashSet;
import java.util.Set;

public class duplicate_from_arr_using_hashset {
    public static void main(String[] args) {
        String names_arr[]={"Dig","Prat","Dig","Tikka","XYX"};

        HashSet<String> names1=new HashSet<String>();

        for(String n:names_arr)
        {
            if(names1.add(n)==false)
            {
                System.out.println("Duplicate Value Is- "+n);
            }
        }
    }
}
