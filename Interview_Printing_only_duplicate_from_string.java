package Programs;

public class Interview_Printing_only_duplicate_from_string {
    public static void main(String[] args) {


        String str = "ABCDABC";
        System.out.print("Duplicate Characters in above string are: ");


        char[] carray = str.toCharArray(); // CONVERT IT TO ARRAY

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j]);

                }
            }
        }

    }
}
