class RearrageArray {
    public static void main(String arr[]){

        int[] arr1 = {1,2,3,4,5,6};

        int result = rearrange(arr1);
        System.out.println(result);
    }

    static int rearrange(int[] arr1) {
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max)
                max = arr1[i];
        }
        for (int j = 1; j < arr1.length; j++) {
            if (arr1[j] < min)
                min = arr1[j];
        }
        return max;
    }
}
