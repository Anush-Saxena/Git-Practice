public class Prob_1688 {
    // Pro Approach
    public int numberOfMatchesPro(int n) {
        int c=n-1;
        return c;
    }
    // Recursive approach
    public int numberOfMatches(int n) {
        if (n == 1) {
            return 0;
        } else {
            int matches = n / 2;
            if (n % 2 != 0) {
                return matches + numberOfMatches(matches + 1);
            } else {
                return matches + numberOfMatches(matches);
            }

        }
    }
}
