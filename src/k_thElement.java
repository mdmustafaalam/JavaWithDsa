import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class k_thElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr1 = {2,3,6,7,9};
        int[] arr2 = {1,4,8,10};

        kthElement(k, arr1, arr2);

    }

    static long kthElement(int k, int arr1[], int arr2[]) {
            int first = arr1.length;
            int second = arr2.length;
            long[] result = new long[first + second];

            System.arraycopy(arr1, 0, result, 0, first);
            System.arraycopy(arr2, 0, result, first, second);


            Arrays.sort(result);
            System.out.println(result);
            for(int i=0;i<result.length;i++){
                if(result[i]==k){
                    return i;
                }
            }
            return -1;
    }
}
