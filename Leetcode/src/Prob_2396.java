
// Optimized approach
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        if (n%2 == 0){
            return false;
        }
        else{
            String bin2;
            int c;
            for (int i=2; i<n; i++){
                StringBuilder bin = new StringBuilder();
                c=n;
                while (c>0){
                    bin.append(c % i);
                    c /= i;
                }
                bin2 = bin.toString();
                if(!bin2.equals(bin.reverse()))
                    return false;
            }
            return true;
        }
    }
}
public class Prob_2396 {
    // This is the brute force approach
    public boolean isStrictlyPalindromic(int n) {
        if (n%2 == 0){
            return false;
        }
        else{
            String bin;
            int c=0;
            for (int i=2; i<n; i++){
                bin = convertToBase(n,i);
                int length = bin.length();
                if (length%2==0){
                    c=0;
                }
                else{
                    c=1;
                }
                if (!bin.substring(0,length/2).equals(bin.substring(length/2+c,length))){
                    return false;
                }
            }
            return true;
        }
    }

    public String convertToBase(int n, int base){
        String bin="";
        while (n>0){
            bin += Integer.toString(n % base);
            n /= base;
        }
        return bin;
    }
}