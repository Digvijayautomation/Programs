package Programs;

public class Interview_How_to_find_string_from_other_string {
    public static void main(String[] args) {
        
        // To find the string
        String str1 = "which hinge is working";
        String   str2 = "hi";
        int Repeat_count = 0;
      


        for(int i=0;i<str1.length();i++)
        {
            String temp="";
            temp+=str1.charAt(i);
            
            for (int j=i+1;j< str1.length();j++)
            {
                temp+=str1.charAt(j);
                
                if(temp.equalsIgnoreCase(str2))
                {
                    Repeat_count++;
                }
            }
        }

        System.out.println(Repeat_count);
    }
   

}
