import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            twoPointer(nums, i, res);
        }
        return res;
    }

    // Two-pointer helper function
    private void twoPointer(int[] nums, int i, List<List<Integer>> res) {
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
                res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                // Skip duplicates for left
                while (left < right && nums[left] == nums[left + 1]) left++;
                // Skip duplicates for right
                while (left < right && nums[right] == nums[right - 1]) right--;
                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }
}
