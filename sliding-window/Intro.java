import java.util.Arrays;

/**
 * Intro
 */
class AverageOfSubArrayOfSizeK {
  public static double[] findAverage(int K, int[] arr) {
    double[] result = new double[arr.length - K + 1];
    System.out.println(Arrays.toString(result) + " before time");

    double windowSum = 0;
    int windowStart = 0;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd];
      System.out.println(windowEnd + "End of window");

      if (windowEnd >= K - 1) {
        result[windowStart] = windowSum / K;
        windowSum -= arr[windowStart];
        windowStart++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    double[] result = AverageOfSubArrayOfSizeK.findAverage(5, new int[] { 1, 3, 6, 4, 6, 7, 9, 3, 8 });
    System.out.println("Average of subarray of size k => " + Arrays.toString(result));
  }

}