class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array to make it easier to handle
        Arrays.sort(nums);
        
        // Initialize variables to keep track of the closest sum and its difference from the target
        int closestSum = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(closestSum - target);
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                
                // Update the closest sum if the current sum is closer to the target
                if (diff < minDiff) {
                    closestSum = sum;
                    minDiff = diff;
                }
                
                // Adjust pointers based on the comparison with the target
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return closestSum;
    }
}
