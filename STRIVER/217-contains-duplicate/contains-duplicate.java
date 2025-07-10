class Solution {
   public boolean containsDuplicate(int[] nums) {
    Set<Integer> hash = Arrays.stream(nums)
                              .boxed()
                              .collect(Collectors.toSet());
    return hash.size() != nums.length;

        // Set<Integer> hash=new HashSet<>();
        // for(int i:nums)
        // {
        //     if(hash.contains(i))
        //     {
        //         return true;
        //     }
        //     hash.add(i);

        // }
        // return false;
    }
}