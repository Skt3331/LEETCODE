class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        // Initialize a pointer to track the position where the next unique element should be placed
        int uniqueIndex = 1;
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous element, 
            // move it to the uniqueIndex position and increment uniqueIndex
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        
        return uniqueIndex;
    }
}
