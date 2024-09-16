import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 18;

        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j< nums.length;j++){
                if(target == nums[i] + nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
