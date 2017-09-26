/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * javadoc comment for this class.
 */
public class ReclamationProject {
    /**
     * A method.
     * @param firstString sting variable that is final
     * @param secondString string variable that is final
     * @return r is returned
     */
    static String findLongestCommonSubstring(final String firstString, final String secondString) {
        if (firstString.length() > secondString.length()) {
           return ReclamationProject.findLongestCommonSubstring(secondString, firstString);
        }
        String currentLongest = " ";
        /*
         * For loop with
         */
        for (int i = 0; i < firstString.length(); i++) {
            for (int j = firstString.length() - i; j > 0; j--) {
                for (int k = 0; k < secondString.length() - j; k++) {
                    if (firstString.regionMatches(i, secondString, k, j)
                            && j > currentLongest.length()) {
                        firstString.substring(i, i + j);
                    }
                }
            }
        } return currentLongest; }
}
