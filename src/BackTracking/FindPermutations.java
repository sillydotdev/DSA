package BackTracking;
public class FindPermutations {
    public static void findPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans+" ");
            return;
        }
        for (int i=0; i< str.length(); i++) {
            char curr = str.charAt(i);
            // remove the current character
            String newStr = str.substring(0, i) + str.substring(i+1);  // sub string  fro 0 to i and i is not included....
                                                                       // substring with only one argument means the second argement is end of the string (n-1)
            findPermutations(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}