package io.sevenlyfoma.github;

/**
 * Code for merge strings alternatively problem.
 */
public final class App {
    App() {
    }

    /**
     * Merges two words together by adding letters in alternative order.
     * Remaining letters are added at end in case of unequal word size.
     * @param word1 first string input where 1 <= word1.length() <= 100
     * @param word2 second string input where 1 <= word1.length() <= 100
     * @return String containing merged words
     */
    public String mergeAlternately(String word1, String word2) {
        String result = "";

        int lowerLength = word1.length();
        int higherLength = word2.length();
        String remainderWord = word2;
        if (word2.length() < lowerLength) {
            lowerLength = word2.length();
            higherLength = word1.length();
            remainderWord = word1;
        }

        for (int i = 0; i < lowerLength; i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }

        for (int i = lowerLength; i < higherLength; i++) {
            result += remainderWord.charAt(i);
        }

        return result;
    }
}
