public class MaxAverageSubarray {

    public static double findMaxAverage(int[] arr, int k) {
        int n = arr.length;

     
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        
        for (int i = k; i < n; i++) {
            windowSum += arr[i];      
            windowSum -= arr[i - k];  
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(arr, k);
        System.out.println("Maximum average subarray value: " + result);
    }
}
