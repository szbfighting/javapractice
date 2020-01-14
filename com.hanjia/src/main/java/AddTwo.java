public class AddTwo {
    public static void main(String[] args) {

        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        a.next=b;
        b.next=c;
        c.next = null;
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(1);
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        ListNode result = new Solution().addTwoNumbers(a,d);

        while(result!=null){
            System.out.println(result.val);
            result= result.next;
        }
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1,q = l2;
        ListNode pre = null,head = null;
        int forward = 0;
        while(p!=null&&q!=null){
            ListNode result = new ListNode((p.val+q.val+forward)%10);
            forward = (p.val+q.val+forward)/10;
            if (pre ==null){
                head = result;
                pre = result;
                q=q.next;
                p=p.next;
                continue;
            }
            pre.next = result;
            pre = result;
            q=q.next;
            p=p.next;
        }
        if (p==null&&q!=null){
            while(q!=null){
                ListNode result = new ListNode((q.val+forward)%10);
                forward = (q.val+forward)/10;
                pre.next = result;
                pre = result;
                q=q.next;
            }
        }
        if (p!=null&&q==null){
            while(p!=null){
                ListNode result = new ListNode((p.val+forward)%10);
                forward = (p.val+forward)/10;
                pre.next = result;
                pre = result;
                p=p.next;
            }
        }
        if (forward!=0){
            ListNode result = new ListNode(forward);
            pre.next = result;
            pre = result;
        }
        pre.next = null;
        return  head;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}