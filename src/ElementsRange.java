
public class ElementsRange {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;

        int n = 7;
        int[] arr = {1, 4, 5, 2, 7, 8, 3};

        boolean ans = check_elements(arr, n, a, b);
        System.out.println(ans);
    }
    static boolean check_elements(int arr[], int n, int A, int B) {
        // calculate the range of possible values between A and B
        int range = B - A;

        // iterate over each element in the array
        for (int i = 0; i < n; i++) {

            // check if the absolute value of the element is within the range
            if ((Math.abs(arr[i])) >= A && (Math.abs(arr[i])) <= B) {

                // compute the adjusted index based on A
                int z = Math.abs(arr[i]) - A;

                // if the adjusted index is within the array and the element at that
                // index is positive, set it to negative to indicate presence
                if (z < n && arr[z] > 0) {
                    arr[z] = arr[z] * -1;
                }
            }
        }


    }
}

