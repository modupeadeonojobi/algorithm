/**
 * Given an array of positive numbers and a positive number ‘k’, find the
 * maximum sum of any contiguous subarray of size ‘k’.
 */

class MaxSubArrayOfSizek {
  public static int findMaxSumSubArray(int k, int[] arr) {
    int windowSum = 0, maxSum = 0;
    int windwowStart = 0;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd];

      if (windowEnd >= k - 1) {
        maxSum = Math.max(maxSum, windowSum);
        windowSum -= arr[windwowStart];
        windwowStart++;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    System.out.println("Maximum sum of a subarray of size K: "
        + MaxSubArrayOfSizek.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));

  }
}