public class Prob_1323 {
    public int maximum69Number (int num) {
        int x=num,index=-1,length=0; // index is taken from last
        while (x>0){
            if (x%10==6){
                index=length;
            }
            x /=10;
            length+=1;
        }
        if (index>-1){
            num += 3*(int)(Math.pow(10,index));
        }
        return num;
    }
}
