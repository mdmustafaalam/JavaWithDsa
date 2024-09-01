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
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0, maxLen = 0;

            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum == k) {
                    maxLen = i + 1;
                }
