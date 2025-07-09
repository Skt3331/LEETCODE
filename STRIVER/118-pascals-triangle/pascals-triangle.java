class Solution {
    // Helper to generate the nth row of Pascal's Triangle
    public static List<Integer> rowgenerate(int row) {
        List<Integer> list = new ArrayList<>();
        int val = 1;
        list.add(val); // First value is always 1

        for (int i = 1; i < row; i++) {
            // Calculate next value using nCk = nCk-1 * (n - k + 1) / k
            val = val * (row - i) / i;
            list.add(val);
        }
        return list;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            list.add(rowgenerate(i));
        }
        return list;
    }
}
