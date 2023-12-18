package Strings;

public class CompareString {

    public static void main(String args[]) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2) {     //s1 and s2 both point to the same string
            System.out.println("Strings are equal...");
        }
        else{
            System.out.println("Strings are not equal...");
        }

        if(s1 == s3) {   //here s3 points to a different string
            System.out.println("Strings are equal...");
        }
        else{
            System.out.println("Strings are not equal...");
        }

        if(s1.equals(s3)) {
            System.out.println("Strings are equal...");
        }
        else{
            System.out.println("Strings are not equal...");
        }
    }
    
}
