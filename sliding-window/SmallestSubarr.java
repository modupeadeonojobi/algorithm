/**
 * Given an array of positive numbers and a positive number ‘S’, find the length
 * of the smallest contiguous subarray whose sum is greater than or equal to
 * ‘S’. Return 0, if no such subarray exists.
 */


 class SmallestSubarr {
   public static int lengthSmallSubArray(int s, int[] arr) {
     int windowSum = 0;
     int minSum = 0;
     for (int windowEnd = 0; windowEnd  < arr.length; windowEnd++) {
       windowSum += arr[windowEnd];

       if( windowEnd >= s - 1) {
         minSum = Math.max(minSum, windowSum);
       }
     }
     return minSum;
   }

   public static void main(String[] args) {
     System.out.println( SmallestSubarr.lengthSmallSubArray(7, new int[] {2, 1, 5, 2, 3, 2}));
   }
  
}
