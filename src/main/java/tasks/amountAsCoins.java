package tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given you have available coins as 25, 10, 5, 2 and 1, write a program to convert an amount of money to coins.

 */
public class amountAsCoins {


    public static List<Integer> makeChange(int amount, int[] coins) {

        //min number of coins needed to make amount
        int[] dp = new int[amount + 1];

        int[] lastCoin = new int[amount + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
//
        for (int a = 1; a <= amount; a++) {
            for (int coin : coins) {
                if (coin <= a && dp[a - coin] != Integer.MAX_VALUE) {
                    int candidate = dp[a - coin] + 1;

                    if (candidate < dp[a]) {
                        dp[a] = candidate;
                        lastCoin[a] = coin;
                    }
                }
            }
        }

        if (dp[amount] == Integer.MAX_VALUE) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        int current = amount;

        while (current > 0) {
            int coin = lastCoin[current];
            result.add(coin);
            current -= coin;
        }

        return result;
    }
//
//    public static void main(String[] args) {
//        int[] coins = {25, 10, 5, 2, 1};
//        int amount = 16;
//
//        List<Integer> solution = makeChange(amount, coins);
//        System.out.println(solution);
//    }

}
