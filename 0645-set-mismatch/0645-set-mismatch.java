class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2]; // To store the repeated and missing numbers
        int[] count = new int[n + 1]; // Count array for 1 to n

        // Count occurrences of each number
        for (int num : nums) {
            count[num]++;
        }

        // Find the repeated and missing numbers
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i; // Repeated number
            } else if (count[i] == 0) {
                result[1] = i; // Missing number
            }
        }

        return result; // Return as {repeated, missing}
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 1, 2, 5, 3}; // Example input
        int[] result = solution.findErrorNums(nums);
        System.out.println("Repeated: " + result[0] + ", Missing: " + result[1]);
    }
}
