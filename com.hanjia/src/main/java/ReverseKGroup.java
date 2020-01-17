/**
 * @Author 大狼狗skr~
 * @Date 2020/1/17 20:08
 * @Version 1.0
 */
public class ReverseKGroup {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;

        ListNode n = new Solution().reverseKGroup(head,5);
        while (n!=null){
            System.out.println(n.val);
            n=n.next;
        }
    }

    static class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head==null) return head;
            ListNode p = head.next,q=head;
            if (p==null) return head;
            for (int i=1;i<k;i++){
                q.next=p.next;
                p.next=head;
                head=p;
                p=q.next;
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
