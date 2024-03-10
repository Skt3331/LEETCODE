class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeftPosition(nums, target);
        int right = findRightPosition(nums, target);
        
        return new int[]{left, right};
    }
    
    private int findLeftPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target) {
                    result = mid;
                }
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }
    
    private int findRightPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target) {
                    result = mid;
                }
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}
