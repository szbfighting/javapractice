import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/23 14:08
 * @Version 1.0
 */
public class RotateRight {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a=  new ListNode(2);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next =null;

        head = new Solution().rotateRight(b,100000);
        while (head!=null){
            System.out.println(head.val);
            head= head.next;
        }

    }

    static class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head==null) return head;
            if (head.next==null) return head;
            int count = 0;
            ListNode p = head;
            while (p!=null){
                p=p.next;
                count++;
            }
            k=k%count;
            while (k>0){
                p = findTail(head);
                p.next.next=head;
                head = p.next;
                p.next=null;
                k--;
            }

            return head;

        }

        public ListNode findTail(ListNode head){
            ListNode p = head;
            ListNode pre=null;
            while (p.next!=null) {
                pre = p;
                p = p.next;
            }
            return pre;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
