import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        // Step 2: Min-heap of size K
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(freq::get));
        for (int num : freq.keySet()) {
            heap.offer(num);
            if (heap.size() > k)
                heap.poll();
        }

        // Step 3: Build answer
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = heap.poll();
        }
        return res;
    }
}
