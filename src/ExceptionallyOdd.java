import java.util.Arrays;

public class ExceptionallyOdd {
    public static void main(String[] args) {
        int[] arr= {1, 2, 5, 2, 3, 1, 3};

        int ans = getOddOccurrence(arr);
        System.out.println(ans);
    }
    static int getOddOccurrence(int[] arr) {
        // code here
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;

    }
}
