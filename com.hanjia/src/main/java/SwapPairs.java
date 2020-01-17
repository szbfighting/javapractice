/**
 * @Author 大狼狗skr~
 * @Date 2020/1/17 19:42
 * @Version 1.0
 */
public class SwapPairs {

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

        ListNode n  = new Solution().swapPairs(d);
        while (n!=null){
            System.out.println(n.val);
            n=n.next;
        }
    }

    static class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head==null) return head;
            ListNode one=head,two=head.next,pre=null,temp;
            while(one!=null&&one.next!=null){
                two=one.next;
                if (one==head){
                    one.next=two.next;
                    two.next=one;
                    head = two;
                }else{
                    pre.next=two;
                    one.next=two.next;
                    two.next=one;
                }

                pre=one;
                one=one.next;

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
