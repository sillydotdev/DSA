package Maths;

public class Prime {
    public static boolean isPrime(int n) {
//        int count = 0;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                count++;
//                if (n/i != i) {
//                    count++;
//                }
//            }
//        }
//        if (count > 2) {
//            return false;
//        }
//        return true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(37));
    }
}
