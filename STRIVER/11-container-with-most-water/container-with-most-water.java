class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1; // corrected here
        int maxwater = 0;

        while (left < right) {
            int width = right - left;
            int water = Math.min(height[left], height[right]) * width; // corrected here
            maxwater = Math.max(maxwater, water); // corrected here

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxwater;
    }
}
