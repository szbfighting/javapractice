/**
 * @Author 大狼狗skr~
 * @Date 2020/1/17 19:23
 * @Version 1.0
 */
public class MergeKLists {

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        ListNode a1= new ListNode(3);
        ListNode b1 = new ListNode(4);
        head1.next=a1;
        a1.next=b1;
        b1.next=null;
        ListNode head = new ListNode(1);
        ListNode a= new ListNode(4);
        ListNode b = new ListNode(5);
        head.next=a;
        a.next=b;
        b.next=null;
        ListNode head2 = new ListNode(1);
        ListNode a2= new ListNode(2);
        ListNode b2 = new ListNode(6);
        head2.next=a2;
        a2.next=b2;
        b2.next=null;

        ListNode n = new Solution().mergeKLists(new ListNode[]{head,head1,a2});

        while (n!=null) {
            System.out.println(n.val);
            n=n.next;
        }

    }

     static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length==0) return null;
                for (int i = lists.length-1;i>0;i--){
                    lists[i-1]=mergeTwoLists(lists[i],lists[i-1]);
                }


            return lists[0];
        }


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

        ListNode(int x) {
            val = x;
        }
    }
}


