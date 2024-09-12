import java.util.Arrays;
import java.util.Scanner;

public class k_thElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr1 = {2,3,6,7,9};
        int[] arr2 = {1,4,8,10};

        int result = kthElement(k, arr1, arr2);
        if (result != -1) {
            System.out.println(k + "-th element is: " + result);
        } else {
            System.out.println("Invalid value of k.");
        }
        sc.close();
    }

    static int kthElement(int k, int arr1[], int arr2[]) {
        int first = arr1.length;
        int second = arr2.length;
        int[] result = new int[first + second];

        // Merging the two arrays
        System.arraycopy(arr1, 0, result, 0, first);
        System.arraycopy(arr2, 0, result, first, second);

        // Sorting the merged array
        Arrays.sort(result);

        // Checking if k is within bounds
        if (k > 0 && k <= result.length) {
            return result[k - 1]; // k-th element in the sorted array (1-based index)
        } else {
            return -1; // Invalid k
        }
    }
}