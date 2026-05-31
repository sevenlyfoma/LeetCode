package io.sevenlyfoma.github;

import java.util.Arrays;
import java.util.List;

/**
 * Solution for problem "Kids With the Greatest Number of Candies".
 */
public final class App {
    private App() {
    }

    /**
     * Test.
     * @return int
     */
    public static int test() {
        return 0;
    }

    /**
     * Solution code.
     * @param candies
     * @param extraCandies
     * @return List<Boolean>
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = findMaxCandies(candies);

        Boolean[] extraChecked = new Boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {
            extraChecked[i] = candies[i] + extraCandies >= max;
        }

        return Arrays.asList(extraChecked);
    }

    /**
     * Helper function.
     * @param candies
     * @return int
     */
    public static int findMaxCandies(int[] candies) {
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        return max;
    }
}
