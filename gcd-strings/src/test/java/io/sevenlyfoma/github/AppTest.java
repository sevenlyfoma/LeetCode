package io.sevenlyfoma.github;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
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
