package Maths;

public class SieveOfEratosthenes {
    public static void primesTillN(int n) {
        int primes[] = new int[n + 1];
        for (int i = 0; i <=n; i++) {
            primes[i] = 1;
        }
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == 1) {
                for (int k = i * i; k <=n; k += i) {
                    primes[k] = 0;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 1) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        primesTillN(36);
    }
}
