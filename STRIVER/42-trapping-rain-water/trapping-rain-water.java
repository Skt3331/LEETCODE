class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}



// class Solution {
//     public int trap(int[] height) {
//         int[] leftmax=new int[height.length];
//         int[] rightmax=new int[height.length];
//         Arrays.fill(leftmax,0);
//         Arrays.fill(rightmax,0);
//         leftmax[0]=height[0];
//         rightmax[height.length-1]=height[height.length-1];
//         for(int i=1;i<height.length;i++)
//         {
//           leftmax[i]=Math.max(leftmax[i-1],height[i]);
//         }
//         for(int i=height.length-2;i>=0;i--)
//         {
//           rightmax[i]=Math.max(rightmax[i+1],height[i]);
//         }
//         int totalwater=0;
//         for(int i=0;i<height.length;i++)
//         {
//             totalwater+=Math.min(leftmax[i],rightmax[i])-height[i];
//         }
//         return totalwater;
//     }
// }