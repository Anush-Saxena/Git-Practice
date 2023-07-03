public class Prob_58 {
    public int lengthOfLastWord(String s) {
        boolean bool = false;
        int x=-1;
        for (int i=s.length()-1; i>=0; i--){
            if (s.charAt(i)>='A' && s.charAt(i)<='z' && !bool){
                bool = true;
                x= i;
            }
            if(bool && s.charAt(i)==' '){
                return(x-i);
            }
        }
        return (x+1);
    }
}
