class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n <=0)
            return;
            
            nums1[m+n -1] = nums1[m-1] > nums2[n-1] ? nums1[--m] : nums2[--n];
    
            merge(nums1, m, nums2,n);
        }
}
