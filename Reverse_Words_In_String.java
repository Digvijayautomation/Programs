package Programs;

public class Reverse_Words_In_String {
    public static void main(String[] args) {

        String str="Selenium Automation Testing";
        String rev ="";
        String [] strArray =str.split(" ");
        for(int i =strArray.length-1;i>=0;i--)

        {
            System.out.print(strArray[i]);
            System.out.print(" ");

        }

    }

}
