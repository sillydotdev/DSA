package Strings;/*
 * Anagrams or not
 */
import java.util.Arrays;

public class Anagrams {

    public static void isAnagram(String str1, String str2){
        boolean status = true;

        if(str1.length() != str2.length()){
            status = false;
        }
        else{
            char[] strArray1 = str1.toLowerCase().toCharArray();
            char[] strArray2 = str2.toLowerCase().toCharArray();

            Arrays.sort(strArray1);
            Arrays.sort(strArray2);

            status = Arrays.equals(strArray1, strArray2);
        }
        if(status){
            System.out.println(str1+" and "+str2+" are anagrams...");
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagrams...");

        }
    }

    public static void main(String args[]){
        String str1 = "race";
        String str2 = "care";

        isAnagram(str1, str2);
    }
    
}
