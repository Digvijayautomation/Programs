package Programs;

public class Interview_Sort_Array_without_using_sort {


    public static void main(String[] args) {
        int [] array = {4,3,5,6,1,2,7,5,4,9,3,2,4};

        for (int i = 0; i <array.length; i++)
          {
            int index = i;
            for (int j = i ; j <= array.length-1; j++)
            {
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;


            System.out.println(array[i]);
        }


    }
}
