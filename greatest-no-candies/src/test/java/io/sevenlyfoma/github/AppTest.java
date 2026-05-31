package io.sevenlyfoma.github;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(0, App.test());
    }

    /**
     * Rigorous Test.
     */
    @Test
    void testMostlyTrue() {
        List<Boolean> res = Arrays.asList(true, true, false, true, true);
        int[] inp = {5, 4, 1, 2, 3};
        assertEquals(res, App.kidsWithCandies(inp, 3));
    }

    @Test
    void testMostlyFalse() {
        List<Boolean> res = Arrays.asList(true, false, false, false, false);
        int[] inp = {5, 4, 1, 2, 3};
        assertEquals(res, App.kidsWithCandies(inp, 0));
    }

    @Test
    void testAllTrue() {
        List<Boolean> res = Arrays.asList(true, true, true);
        int[] inp = {5, 4, 1};
        assertEquals(res, App.kidsWithCandies(inp, 200));
    }
}
