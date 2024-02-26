class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        if (totalLength % 2 == 0) {
            int leftMedian = findKthElement(nums1, nums2, totalLength / 2, 0, 0);
            int rightMedian = findKthElement(nums1, nums2, totalLength / 2 + 1, 0, 0);
            return (leftMedian + rightMedian) / 2.0;
        } else {
            return findKthElement(nums1, nums2, totalLength / 2 + 1, 0, 0);
        }
    }
    
    private int findKthElement(int[] nums1, int[] nums2, int k, int start1, int start2) {
        if (start1 >= nums1.length) {
            return nums2[start2 + k - 1];
        }
        if (start2 >= nums2.length) {
            return nums1[start1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        
        int mid1 = start1 + k / 2 - 1 < nums1.length ? nums1[start1 + k / 2 - 1] : Integer.MAX_VALUE;
        int mid2 = start2 + k / 2 - 1 < nums2.length ? nums2[start2 + k / 2 - 1] : Integer.MAX_VALUE;
        
        if (mid1 < mid2) {
            return findKthElement(nums1, nums2, k - k / 2, start1 + k / 2, start2);
        } else {
            return findKthElement(nums1, nums2, k - k / 2, start1, start2 + k / 2);
        }
    }
}
