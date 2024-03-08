class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize the count of elements not equal to val
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Place it at position k
                nums[k] = nums[i];
                k++; // Increment k to track the number of non-val elements
            }
        }
        
        return k; // Return the count of elements not equal to val
    }
}
