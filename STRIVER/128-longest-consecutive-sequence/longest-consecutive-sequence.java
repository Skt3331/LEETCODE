class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0)
    return 0;
          Set<Integer> set = Arrays.stream(nums)
                                 .boxed()
                                 .collect(Collectors.toSet());

       
       int largecon=1;

       for(int i:set)
       {
        if(set.contains(i-1))
        continue;
      int counter=1;
       while(set.contains(i+1))
       {
        counter++;
        i+=1;
       }
       if(largecon<counter)
       largecon=counter;
       }
    
   
   return largecon;

    }
}