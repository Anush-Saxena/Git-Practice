public class Prob_2652 {
    // Fastest 
    public int sumOfMultiples(int n) {
        int sum=0;
        for (n=n ; n>=3; n--){
            if (n%3==0 || n%5==0 || n%7==0){
                sum+=n;
            }
        }
        return sum;
    }
}
