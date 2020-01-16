/**
 * @Author 大狼狗skr~
 * @Date 2020/1/16 12:45
 * @Version 1.0
 */
public class RemoveNthFromEnd {

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
        head = new Solution().removeNthFromEnd(d,1);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null) return null;
            ListNode p =head,q=null,l;
            while (p!=null){
                int count = 0;
                l=p;
                while(l!=null){
                    count++;
                    l=l.next;
                }

                if (count==n){
                    if (p==head){
                        head = p.next;
                        p=head;
                    }else{
                        q.next=p.next;
                        p=q;
                    }
                    break;
                }
                q=p;
                p=p.next;
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
