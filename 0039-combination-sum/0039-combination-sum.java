import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = start; i < candidates.length; i++) {
                current.add(candidates[i]);
                backtrack(result, current, candidates, target - candidates[i], i); // Note: Pass 'i' instead of 'start' to allow reusing same element
                current.remove(current.size() - 1);
            }
        }
    }
}
