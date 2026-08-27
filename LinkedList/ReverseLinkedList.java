package DSA.LinkedList;

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;

        for (ListNode curr = head; curr != null; ) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}