/**
 * @Author 大狼狗skr~
 * @Date 2020/1/31 10:13
 * @Version 1.0
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(4));
    }

    static class Solution {
        public int climbStairs(int n) {
            int[] num = new int[n+1];
            return paLouTi(0,n,num);
        }

        public  int paLouTi(int k,int n,int[] num){
            if(k>n)
                return 0;
            else if(k==n)
                return 1;
            if (num[k]>0)
                return num[k];
            num[k] = paLouTi(k+1,n,num)+paLouTi(k+2,n,num);

            return num[k];
        }
    }
}
