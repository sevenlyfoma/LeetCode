package io.sevenlyfoma.github;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple Merge Strings Alternatively problem.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    /**
     * Test basic case of two 3 letter inputs being merged.
     */
    @Test
    void testEqualLength() {
        App a = new App();
        assertEquals("axbycz", a.mergeAlternately("abc", "xyz"));
    }

    /**
     * Test basic case of the same inputs as "testEqualLength" but the input order has changed.
     */
    @Test
    void testInputOrderMatters() {
        App a = new App();
        assertEquals("xaybzc", a.mergeAlternately("xyz", "abc"));
    }


    /**
     * Test case of the inputs being differnent length, with the first word longer.
     */
    @Test
    void testUnequalLengthWord1Longer() {
        App a = new App();
        assertEquals("axbyczddd", a.mergeAlternately("abcddd", "xyz"));
    }

    /**
     * Test case of the inputs being differnent length, with the second word longer.
     */
    @Test
    void testUnequalLengthWord2Longer() {
        App a = new App();
        assertEquals("axbyczwww", a.mergeAlternately("abc", "xyzwww"));
    }

}
