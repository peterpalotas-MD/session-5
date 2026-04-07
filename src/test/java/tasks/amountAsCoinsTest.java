package tasks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.amountAsCoins.makeChange;

class amountAsCoinsTest {

    @Test
    public void testBestCoins(){

        int[] coins = {25, 10, 5, 2, 1};
        int amount = 16;

        List<Integer> solution = makeChange(amount, coins);

        assertEquals(List.of(10,5,1), solution);


    }

    @Test
    public void testImpossibleCoins(){

        int[] coins = {10,20};
        int amount = 16;

        List<Integer> solution = makeChange(amount, coins);

        assertEquals(List.of(), solution);


    }


}