package Programs;

public class Reverse_string {

    public static void main(String[] args) {


        String str="Digvijay Tikka";

        System.out.println(str);

        String rev="";
        char t;

        for(int i=0;i<str.length();i++)
        {
            t = str.charAt(i);
            rev =t +rev;
        }
        System.out.println("Reversers Of String Is\t"+rev);
    }
}
