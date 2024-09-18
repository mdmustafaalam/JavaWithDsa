public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,2,4,3};

        int result = duplicateNumber(arr1);
        System.out.println(result);
    }

    static int duplicateNumber(int[] arr1) {
        if (arr1.length >= 0) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] == arr1[j]) {
                        System.out.print(arr1[j] + " ");
                    }
                }
            }
        }
        return -1;
    }
}
