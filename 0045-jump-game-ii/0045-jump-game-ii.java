class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }

        int jumps = 0;
        int currentMaxReach = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentMaxReach) {
                jumps++;
                currentMaxReach = farthest;
                if (currentMaxReach >= n - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}
