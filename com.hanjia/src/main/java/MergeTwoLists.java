/**
 * @Author 大狼狗skr~
 * @Date 2020/1/16 14:42
 * @Version 1.0
 */
public class MergeTwoLists {

    public static void main(String[] args) {
        System.out.println("in");
        ListNode head = new ListNode(9);
        ListNode a= new ListNode(-9);
        ListNode b = new ListNode(3);
        head.next=a;
        a.next=b;
        b.next=null;

        ListNode head1 = new ListNode(5);
        ListNode a1= new ListNode(5);
        ListNode b1 = new ListNode(7);
        head1.next=a1;
        a1.next=b1;
        b1.next=null;

        ListNode n = new Solution().mergeTwoLists(a,a1);
        while (n!=null) {
            System.out.println(n.val);
            n=n.next;
        }
    }

    static class Solution {//               p -9  3      5   7  q
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1==null&&l2==null)
                return null;
            if (l1 == null)
                return l2;
            if (l2==null)
                return l1;
            ListNode p,q=l2,head = l1,pre = null;
            ListNode n;
            while (q!=null){
                n=q.next;
                q.next=null;
                p=head;
                while (p!=null){
                    if (q.val<=p.val){
                        if (p==head){
                            q.next=p;
                            p=q;
                            head=p;
                        }else {
                            q.next = p;
                            pre.next = q;
                        }

                        break;
                    }else{
                        pre = p;
                        p=p.next;
                    }
                }

                if (p == null){
                    pre.next=q;
                }
                q=n;
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
