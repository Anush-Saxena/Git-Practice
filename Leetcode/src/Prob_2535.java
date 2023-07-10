public class Prob_2535 {
    public int differenceOfSum(int[] nums) {
        int diff =0;
        for (int x: nums){
            diff +=difference(x);
        }
        return diff;
    }
    public int difference(int n){
        if (n >= 10){
            int x=n;
            int sum =0;
            while (n>0){
                sum += n%10;
                n /= 10;
            }
            return x-sum;
        }
        else
            return 0;
    }
}
