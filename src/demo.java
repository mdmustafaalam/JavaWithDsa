import java.util.*;

public class demo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=4;
        int k=2;
        int ans =lenOfLongSubarr(arr,n,k);
        System.out.println(ans);
    }
        static int lenOfLongSubarr(int[] arr, int n, int k) {
            // HashMap to store (sum, index) pairs
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0, maxLen = 0;

            // Traverse the given array
            for (int i = 0; i < n; i++) {
                // Accumulate sum
                sum += arr[i];

                // When subarray starts from index 0
                if (sum == k) {
                    maxLen = i + 1;
                }

                // If 'sum' is not present in the map, add it with the index 'i'
                if (!map.containsKey(sum)) {
                    map.put(sum, i);
                }

                // Check if 'sum - k' is present in the map or not
                if (map.containsKey(sum - k)) {
                    // Update maxLength if needed
                    maxLen = Math.max(maxLen, i - map.get(sum - k));
                }
            }

            // Return the required maximum length
            return maxLen;
        }
    }
