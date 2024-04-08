class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class MergePointOfLists {
    public static ListNode findMergePoint(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null)
            return null;
        
        ListNode a = head1;
        ListNode b = head2;
        
        while (a != b) {
            a = (a == null) ? head2 : a.next;
            b = (b == null) ? head1 : b.next;
        }
        
        return a;
    }
    
    public static void main(String[] args) {
        ListNode common = new ListNode(6);
        common.next = new ListNode(7);
        common.next.next = new ListNode(8);
        
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = common;
        
        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);
        head2.next.next = common;
        
        ListNode mergePoint = findMergePoint(head1, head2);
        if (mergePoint != null) {
            System.out.println("Merge Point: " + mergePoint.val);
        } else {
            System.out.println("No Merge Point Found");
        }
    }
}
