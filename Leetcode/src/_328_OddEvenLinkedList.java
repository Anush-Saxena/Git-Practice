public class _328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode p1,p2,node;
        if (head != null && head.next != null){
            p1=head;
            p2=head.next;
            node=p2;
            while (p2!=null && p2.next!=null){
                p1.next=p2.next;
                p2.next=p2.next.next;
                p1=p1.next;
                p2=p2.next;
            }
            p1.next=node;
        }
        return head;
    }
}
