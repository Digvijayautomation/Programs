
public class duplicate_from_arr {
    public static void main(String[] args) {

        String names[]={"Dig","Prat","Dig","Tikka","XYX"};

        for(int i=0;i<names.length;i++)
        {
            for(int j=i+1;j<names.length;j++)
            {
                if(names[i].equalsIgnoreCase(names[j]))
                {
                    System.out.println("Duplicate Value is-"+ names[i]);
                }
            }
        }

    }
}
