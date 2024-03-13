import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort candidates to handle duplicates and reduce redundant search
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) // Skip duplicates
                continue;
            
            if (target - candidates[i] < 0) // Stop if sum exceeds target
                break;
            
            current.add(candidates[i]);
            backtrack(result, current, candidates, target - candidates[i], i + 1); // Use next index to avoid reusing the same element
            current.remove(current.size() - 1);
        }
    }
}
