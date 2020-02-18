/**
 * @Author 大狼狗skr~
 * @Date 2020/2/18 8:36
 * @Version 1.0
 */
public class KnightProbability {

    public static void main(String[] args) {

        System.out.println(new Solution().knightProbability(3,2,0,0));
    }

    static class Solution {
        public double knightProbability(int N, int K, int r, int c) {
            double result = getRes(N,K,0,r,c);
            return result;
        }

        private double getRes(int n, int k, int i, int r, int c) {
            if (r>n-1||c>n-1||r<0||c<0)
                return 0;
            if (i==k)
                return 1;
            double res = 0;
            res += getRes(n,k,i+1,r-1,c-2);
            res += getRes(n,k,i+1,r-2,c-1);
            res += getRes(n,k,i+1,r-2,c+1);
            res += getRes(n,k,i+1,r-1,c+2);
            res += getRes(n,k,i+1,r+1,c+2);
            res += getRes(n,k,i+1,r+2,c+1);
            res += getRes(n,k,i+1,r+2,c-1);
            res += getRes(n,k,i+1,r+1,c-2);
            return res/8.0;

        }
    }
}
