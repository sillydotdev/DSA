package Recursion;

public class StringsWithSameFirstLastIndex {
    public static int stringsWithSameFirstLastIndex(String str, int i, int j, int n) {
        if(n <= 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int res = stringsWithSameFirstLastIndex(str, i+1, j, n-1) +
                    stringsWithSameFirstLastIndex(str, i, j-1, n-1) -
                    stringsWithSameFirstLastIndex(str, i+1, j-1, n-2);
        if(str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(stringsWithSameFirstLastIndex(str, 0, n-1, n));
    }
}
