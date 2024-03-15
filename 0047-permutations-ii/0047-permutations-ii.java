import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to ensure duplicates are adjacent
        List<Integer> tempList = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, result, tempList, used);
        return result;
    }
    
    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> tempList, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue; // Skip duplicates or already used elements
            }
            tempList.add(nums[i]);
            used[i] = true;
            backtrack(nums, result, tempList, used);
            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
    }
}
