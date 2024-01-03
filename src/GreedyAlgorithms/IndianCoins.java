package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};    // we wrote Integer class here because to sort it in reverse order
        Arrays.sort(coins, Comparator.reverseOrder());              // we have to use it. we can't use reverseOrder function with "int"

        int countOfCoins = 0;
        int amount = 540;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    arr.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Minimum number of coins = "+countOfCoins);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}
