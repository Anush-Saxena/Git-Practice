public class Prob_88 {
}
// Brute Force approach.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m; i<m+n; i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}
