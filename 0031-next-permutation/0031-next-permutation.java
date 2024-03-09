class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        // Find the first decreasing sequence from right to left
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // If no decreasing sequence found, reverse the entire array
        if (i == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        
        // Find the smallest element greater than nums[i] in the right subarray
        int j = nums.length - 1;
        while (j >= 0 && nums[j] <= nums[i]) {
            j--;
        }
        
        // Swap nums[i] with nums[j]
        swap(nums, i, j);
        
        // Reverse the right subarray
        reverse(nums, i + 1, nums.length - 1);
    }
    
    // Helper method to reverse an array within the specified range
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    // Helper method to swap elements in an array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
