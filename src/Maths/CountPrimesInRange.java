package Maths;

import java.util.ArrayList;
import java.util.List;

public class CountPrimesInRange {
    public static List<Integer> getSieve(int n) {
        List<Integer> list = new ArrayList<>();
        int primes[] = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = 1;
        }
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = 0;
                }
            }
            if (primes[i] == 1) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(getSieve(30));
    }
}
