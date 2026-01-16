import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum__Find_All_Unique_Triplets_That_Sum_to_Zero {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum1(nums));
    }
    // Brute Force
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return result;
    }
    // Optimized
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) { // to avoid duplicacy as if starting 2 no. is same so we calculate only for first.
                continue;
            }
            int target = -nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } 
                else if (sum < target) {
                    j++; 
                } 
                else {
                    k--; 
                }
            }
        }
        return result;
    }
    
}
