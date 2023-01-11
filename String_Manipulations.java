

public class String_Manipulations {

    public static void main(String[] args) {

        System.out.println("String Manipulation Functions");

        String str="Rain Is Started In Pune";

        System.out.println("Given String Is-"+str);
        System.out.println("Length Of String Is-" +str.length());

        System.out.println("Character At 7th Index Of String Is-" +str.charAt(7));

        System.out.println("Index Of 1st occurrence of n In String Is-" +str.indexOf("n")); // It will return index of 1st occurrence of n

        // if i want to find 2nd occurrence of n
        System.out.println("Index Of 2nd occurrence of n In String Is-" +str.indexOf("n",str.indexOf("n")+1)); // it will start searching from 4 index because 1st n is at 3

        // to find the index of specific word in sentence
        System.out.println("Index of Pune word in string is-"+ str.indexOf("Pune"));

        // IF word is not found in the string it will return -1
        System.out.println("Index of Pune word in string is-"+ str.indexOf("Mumbai"));




        System.out.println("String Comparsion operation");

        String str1="Digvijay";
        String str2="digvijay";

        System.out.println(str1.equals(str2)); // it will return false because D in second str is small letter

        System.out.println(str1.equalsIgnoreCase(str2)); // it will return true because we are ignoring the cases

    // Substring

        System.out.println(str1.substring(6)); // it will skip 0-5 and return from 6-end
        System.out.println(str1.substring(0,6)); // it will return from 0-6


        // Trim

        String str3="  hello word ";
        System.out.println(str3.trim()); //it will only trim the space before and after the sentence (not in between words)

        System.out.println(str3.replaceAll(" ","")); // replacing " " with no space""


        // Split Methods

        String str4="Digvijay_Tukaram_Tikka_1992";
        String name[]=   str4.split("_"); // it will split it and store it into array because we can not save 4 words in one string

        System.out.println(name.length);

        // we can print it using for or for each loop
        for (String n:name)
        {
            System.out.println(n);
        }

        // Concat Methods

        String Concatinated_str3_str4  =str3.concat(str4);
        System.out.println(Concatinated_str3_str4);



        String x="Hello";
        String y="Word";
        int x1=100;
        int y1=200;

        System.out.println(x+y+x1+y1); // it will start executing from left to right
        System.out.println(x+y+(x1+y1)); // it will execute () first

        System.out.println(x1+y1+x+y);



    }
}
