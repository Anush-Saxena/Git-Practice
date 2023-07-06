import java.util.Arrays;
import java.util.HashMap;

public class Prob_26 {
    // More optimized than HashMap
    // RunTime = 1ms
    public int removeDuplicates3(int[] nums) {
        int len = nums.length;
        int [] arr = Arrays.copyOf(nums,len);
        int count = 0;
        for (int i=1; i<len; i++){
            if (count>0 && arr[i-1] != arr[i]){
                nums[i-count]=arr[i];
            }
            else if (arr[i-1] == arr[i]) {
                count+=1;
            }
        }
        return len-count;
    }
    // A more advanced using HashMap
    // RunTime = 2ms
    public int removeDuplicates2(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int distinct = 0;
        for (int i=0; i<nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
                nums[distinct]=nums[i];
                distinct+=1;
            }
        }
        return distinct;
    }
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
