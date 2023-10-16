public class Prob_1290 {
    int sum;
    int j=0;

    public int getDecimalValue(ListNode head) {
        if (head.next != null){
            sum = getDecimalValue(head.next);
            j++;
            return head.val * (int)Math.pow(2,j) + sum;
        }
        return head.val;
    }
}
