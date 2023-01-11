

public class Swapping_2_Strings_without_3rd_Variable {
    public static void main(String[] args) {

        String str1="Digvijay";
        String str2="Tikka";

      int len=str1.length();  // 8
        str1 = str1+str2; // DigvijayTikka

        str2=str1.substring(0,len); // substring means cut 0-8 from DigvijayTikka i.e Digvijay and assign it to str2
        str1=str1.substring(len); //skip 0-8 from DigvijayTikka and assign remaining to str1


        System.out.println(str1);
        System.out.println(str2);

    }







}
