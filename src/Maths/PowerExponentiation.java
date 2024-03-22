package Maths;

public class PowerExponentiation {
    public static int powerExponentiation(int x, int n) {
        int temp = n;   // for negative n
        int ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            } else {
                n = n / 2;
                x = x * x;
            }
        }
        if (temp < 0) ans = 1 / ans;    // for negative n
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(powerExponentiation(2, 21));
    }
}
