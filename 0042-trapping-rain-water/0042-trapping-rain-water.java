class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;
        
        while (left < right) {
            // Update leftMax and rightMax
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            
            // Calculate the trapped water for the current position
            if (height[left] < height[right]) {
                trappedWater += leftMax - height[left];
                left++;
            } else {
                trappedWater += rightMax - height[right];
                right--;
            }
        }
        
        return trappedWater;
    }
}
