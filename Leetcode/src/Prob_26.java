public class Prob_26 {
    //Basic solution (Brute force)
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i=1; i<nums.length; i++){
            if (nums[i]==nums[i-1]){
                count+=1;
                nums[i-1]=101;
            }
        }
        Arrays.sort(nums);
        return nums.length-count;
    }
}
