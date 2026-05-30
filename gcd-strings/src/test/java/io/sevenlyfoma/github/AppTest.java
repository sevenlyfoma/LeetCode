package io.sevenlyfoma.github;

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
        App a = new App();
        assertEquals(1, 1);
    }


    /**
     * Rigorous Test.
     */
    @Test
    void testThreeSizeSubString() {
        App a = new App();
        assertEquals("ABC", a.gcdOfStrings("ABCABC", "ABC"));
    }

    /**
     * Rigorous Test.
     */
    @Test
    void testTwoSizeSubString() {
        App a = new App();
        assertEquals("AB", a.gcdOfStrings("ABABAB", "AB"));
    }

    /**
     * Rigorous Test.
     */
    @Test
    void testNoSubString() {
        App a = new App();
        assertEquals("", a.gcdOfStrings("ABABAB", "AAA"));
    }
}
