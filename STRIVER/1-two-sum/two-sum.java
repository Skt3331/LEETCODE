class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) { 
            int find = target - nums[i];
            if(hmap.containsKey(find)) {
                return new int[]{hmap.get(find), i};
            }
            hmap.put(nums[i], i);
        }
        return new int[0]; // Or throw exception
    }
}
