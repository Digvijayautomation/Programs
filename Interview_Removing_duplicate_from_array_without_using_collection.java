package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Interview_Removing_duplicate_from_array_without_using_collection {

    public static void main(String[] args) {


        int [] array = {4,3,5,6,1,2,7,5,4,9,3,2,4};

        ArrayList list=new ArrayList<>();


        for(int i=0;i<array.length;i++)
        {
            int num=array[i]; // assign i to num

           if(list.contains(num))  // check num is available in list yes , do nothing
       {
            // Do nothing
       }
       else {
           list.add(num);  // if number not there add it
       }

        }

        System.out.println(list);



    }
}
