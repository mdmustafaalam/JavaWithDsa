public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x=3;
        int ans = search(arr, x);
        System.out.println(ans);
    }

    static int search(int arr[], int x) {
        // Your code here
        for(int i=0; i<arr.length; i++){
            if(x == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
