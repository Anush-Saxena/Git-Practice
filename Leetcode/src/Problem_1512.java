public class Problem_1512 {
    // # Normal Approach
    public int numIdenticalPairs(int[] nums) {
        int l = nums.length;
        int good = 0;
        for (int i=0; i<l-1; i++){
            for (int j=i+1; j<l; j++){
                if (nums[i] == nums[j]){
                    good+= 1;
                }
            }
        }
        return good;
    }
}