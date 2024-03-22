package Maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsOptimised {
//    public static List<Integer> primeFactors(int n) {
//        List<Integer> ls = new ArrayList<>();   // However for a prime number it will loop to "n", means its TC willl be O(n)
//        for (int i = 2; i <= n; i++) {
//            if (n % i == 0) ls.add(i);
//            while(n % i == 0) {
//                n = n / i;
//            }
//        }
//        return ls;
//    }

    public static List<Integer> primeFactors(int n) {
        List<Integer> ls = new ArrayList<>();   // However for a prime number it will loop to "n", means its TC willl be O(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) ls.add(i);
            while(n % i == 0) {
                n = n / i;
            }
        }
        if (n != 1) ls.add(n);  // because if n = prime number, Math.sqrt will never come there. And when we keep dividing
        return ls;              // if at last n != 1, means it was a prime, and we can add than number too
    }
    public static void main(String[] args) {
        System.out.println(primeFactors(36));
        System.out.println(primeFactors(37));
    }
}
