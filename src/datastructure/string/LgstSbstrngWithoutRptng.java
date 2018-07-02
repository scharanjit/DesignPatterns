package datastructure.string;

import java.util.Arrays;

public class LgstSbstrngWithoutRptng {

    static final int NO_OF_CHARS = 256;

    static String longestUniqueSubstringWRepeatingCharacter(String str) {
        int len = str.length();
        int currentLength = 1;    // length of current substring
        int maximumLength = 1;    // result
        int previousIndex = -1;        //  previous index
        int i;
        String longestSubString = "" + str.charAt(0);
        int visited[] = new int[NO_OF_CHARS];

        // Initialize visited array with -1
        Arrays.fill(visited, -1);

		/* Mark first character as visited by storing the
             index of first character in visited array. */
        visited[str.charAt(0)] = 0;

        /* Start from the second character
         */
        for (i = 1; i < len; i++) {
            previousIndex = visited[str.charAt(i)];
            /** If current character is not seen yet or is not part of current
             * * non repeating character string, simply increase the length of non repeating character string * */
            if (previousIndex == -1 || i - currentLength > previousIndex)
                currentLength++;
			/* If the current character is present in currently
               considered non repeating character string,
               then update non repeating character string
               to start from the next character of previousIndex. */
            else {
                /* Before updating non repeating character, check for maximum length*/
                if (currentLength > maximumLength) {
                    maximumLength = currentLength;
                    int startIndex = i - currentLength;
                    longestSubString = str.substring(startIndex, i);
                }
                currentLength = i - previousIndex;
            }
            // update the index of current character
            visited[str.charAt(i)] = i;
        }

        // check for maximum length
        if (currentLength > maximumLength) {
            maximumLength = currentLength;
            int startIndex = i - currentLength;
            longestSubString = str.substring(startIndex, i);
        }

        return longestSubString;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        String str = "TheJavaTutorial";
        System.out.println("The input string is " + str);

        String longestUniqueSubsttr = longestUniqueSubstringWRepeatingCharacter(str);

        System.out.println("Longest substring without repeating character: " + longestUniqueSubsttr);
    }
}
