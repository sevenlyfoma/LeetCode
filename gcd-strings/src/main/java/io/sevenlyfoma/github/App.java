package io.sevenlyfoma.github;

/**
 * Code for the GCD Strings solution.
 */
public final class App {
    App() {
    }

    /**
     * Function that finds the gcd of two strings.
     * @param str1
     * @param str2
     * @return String
     */
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int min = Math.min(len1, len2);


        int count = min;
        Boolean found = false;
        String slice = "";

        while (count > 0 && !found) {
            if (len1 % count == 0 && len2 % count == 0) {
                slice = str1.substring(0, count);
                found = checkSliceRepeats(str1, slice) && checkSliceRepeats(str2, slice);
            }

            count--;
        }
        if (!found) {
            slice = "";
        }

        return slice;
    }

    /**
     * Helper function that checks if a substring appears repeatedly in a string.
     * @param str
     * @param slice
     * @return Boolean
     */
    public Boolean checkSliceRepeats(String str, String slice) {
        Boolean doesRepeat = true;

        for (int i = 0; i < str.length(); i += slice.length()) {
            if (!str.substring(i, i + slice.length()).equals(slice)) {
                doesRepeat = false;
            }
        }


        return doesRepeat;
    }
}
