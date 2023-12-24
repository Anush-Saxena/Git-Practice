public class ReorderList_143 {

    //Recursion
    ListNode p1;
    public void reorderList(ListNode head) {
        p1 = head;
        tail(p1);
    }
    public void tail(ListNode p2){
        if (p2.next != null){
            tail(p2.next);
        }
        if ( p1 != null && p1!=p2 && p1.next!=p2){
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
        }
        else if (p1 == p2){
            p1.next = null;
            p1=p1.next;
        }
        else if (p1 != null && p1.next ==p2){
            p2.next = null;
            p1=null;
        }
        // else if(p1.next == p2){
        //     p2.next = null;
        // }
    }
}
class ListNode{
    ListNode next;
}
