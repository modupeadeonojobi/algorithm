import java.util.*;

/**
 * Given a string, find the length of the longest substring which has no
 * repeating characters.
 */

public class LengthNoRepeting {
  public static int findLongestSubLength(String str) {
    int windowStart = 0;
    int maxLength = 0;
    Map<Character, Integer> charIndexMap = new HashMap<>();

    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
      char rightChar = str.charAt(windowEnd);

      if (charIndexMap.containsKey(rightChar)) {
        windowStart = Math.max(windowStart, charIndexMap.get(rightChar) + 1);
      }
      charIndexMap.put(rightChar, windowEnd);
      maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
    }
      return maxLength;
  }

  public static void main(String[] args) {
    System.out.println("Length of the longest substring: " + LengthNoRepeting.findLongestSubLength("qweqwwe"));
    System.out.println("Length of the longest substring: " + LengthNoRepeting.findLongestSubLength("abbbb"));
  }
}