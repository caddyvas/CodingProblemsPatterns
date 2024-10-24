package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

//  Calculates the length of the longest substring without repeating characters in a string.
public class LongestSubString {
    /**
     * Hint: Detect the pointer at the first repeated character. Continue the pointer from the next index of last occurrence
     * ex: abcbfgh - stop at index: 3, as b is repeated at index: 3. Move the pointer to the next index of last occurrence
     * i.e. move to index:2
     *
     * @param str - string
     * @return length of the longest substring
     */
    public int findLongestSubstring(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        int maxCount = 0;
        int pointer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charMap.containsKey(str.charAt(i))) {
                // update the pointer
                pointer = Math.max(pointer, charMap.get(str.charAt(i)) + 1);
            }
            charMap.put(str.charAt(i), i);

            maxCount = Math.max(maxCount, i - pointer + 1);
        }
        return maxCount;
    }
}
