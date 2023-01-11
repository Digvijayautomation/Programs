

public class Removing_special_charactors {

    public static void main(String[] args) {

        String str="Digvijay@1992#";

        str=str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(str);

    }
}
