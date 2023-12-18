package Strings;

public class SubStringg {

    public static void subString(String str, int si, int ei) {
        String subStr = "";
        for(int i=si; i<ei; i++) {
            subStr += str.charAt(i);
        }
        System.out.println(subStr);
    }

    public static void main(String args[]) {
        String str = "HelloWorld";
        subString(str, 0, 4);
    }
    
}
