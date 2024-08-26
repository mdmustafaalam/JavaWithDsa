import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        SumArraySeris(arr);
    }

    static void SumArraySeris(int[] arr) {
        int cont= 0;
        for (int i = 0; i < arr.length; i++) {
            cont += arr[i];
        }
        System.out.println(cont);
    }
}
