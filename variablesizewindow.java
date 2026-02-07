public class variablesizewindow {
  

    public static int smallestSubarrayLength(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // Shrink the window while sum >= k
            while (sum >= k) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        // If no such subarray exists
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int k = 7;

        int result = smallestSubarrayLength(arr, k);
        System.out.println("Smallest subarray length = " + result);
    }
}


