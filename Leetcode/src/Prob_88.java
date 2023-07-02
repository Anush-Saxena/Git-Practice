// More optimized solution
public class Prob_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1; int j=n-1;
        while(i>=-1 & j>-1){
            if (i>-1 && nums1[i] >= nums2[j]){
                nums1[i+j+1] = nums1[i];
                i-=1;
            }
            else{
                nums1[i+j+1] = nums2[j];
                j-=1;
            }
        }
    }
}

// Brute Force approach.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m; i<m+n; i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}
