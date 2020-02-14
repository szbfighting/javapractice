/**
 * @Author 大狼狗skr~
 * @Date 2020/2/14 11:25
 * @Version 1.0
 */
public class DeleteDuplicates2 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(3);
        ListNode head5 = new ListNode(3);
        ListNode head6 = new ListNode(4);
        ListNode head7 = new ListNode(4);
        ListNode head8 = new ListNode(5);
        ListNode head9 = new ListNode(5);
        head.next = head1;
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;
        head5.next=head6;
        head6.next=head7;
        head7.next=head8;
        head8.next=head9;
        head9.next=null;
        head = new Solution().deleteDuplicates(head);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode p = head,q;
            while(p!=null){
                q=p.next;
                while(q!=null&&q.val==p.val){
                    p.next=q.next;
                    q=p.next;
                }
                p=q;

            }

            return head;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
