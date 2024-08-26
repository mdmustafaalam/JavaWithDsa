import java.util.Arrays;

public class ArrayLargElement {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};

        int ans = largest(arr);
        System.out.println("The Large Number is: "+ans);
    }
    static int largest(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            return arr[n-1];
        }
        return -1;
    }
}
