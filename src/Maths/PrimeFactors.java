package Maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> primeFactors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (isPrime(i)) list.add(i);
                if (n/i != i) {
                    if (isPrime(n / i)) list.add(n/i);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(primeFactors(49));
        System.out.println(primeFactors(36));
    }
}
