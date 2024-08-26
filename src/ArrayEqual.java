import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};

        boolean ans = check(arr1,arr2);
        System.out.println(ans);
    }

    static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            return true;
        } else {
            return false;
        }
    }
}
