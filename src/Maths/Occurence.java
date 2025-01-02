package Maths;

import java.util.HashMap;

public class Occurence {
    public static void main(String[] args) {
        String str = "abcadef";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(int i = str.length() - 1; i>=0; i--) {
            if(charCount.containsKey(str.charAt(i))) {
                int count = charCount.get(str.charAt(i));
                    charCount.put(str.charAt(i), ++count);
            }
            else {
                charCount.put(str.charAt(i), 1);
            }
//            if(charCount.containsKey(str.charAt(i)) {
//                int count = charCount.get(str.charAt(i));
//                charCount.put(str.charAt(i), ++count);
//            } else {
//                charCount.put(str.charAt(i), 1);
//            }
        }
        System.out.println(charCount);

    }
}
