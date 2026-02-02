public class intersection_of_two_linked_lists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
 }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempa = headA;
        ListNode tempb = headB;
        while (tempa != tempb){
            if(tempa == null){
                tempa = headB;
            }
            else{
                tempa = tempa.next;
            }
            if(tempb == null){
                tempb = headA;
            }
            else{
                tempb = tempb.next;
            }

        }
        return tempa;
    }
}
