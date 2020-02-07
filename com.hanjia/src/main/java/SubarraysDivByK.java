/**
 * @Author 大狼狗skr~
 * @Date 2020/2/7 9:54
 * @Version 1.0
 */
public class SubarraysDivByK {

    public static void main(String[] args) {
        System.out.println(new Solution().subarraysDivByK(new int[]{5},9));
    }

    static class Solution {
        public int subarraysDivByK(int[] A, int K) {
            int[] P = new int[A.length+1];
            for (int i = 0;i<A.length;i++){
                P[i+1] = P[i]+A[i];
            }

            int[] count = new int[K];
            for (int p:P){
                count[(p%K+K)%K]++;
            }

            int res = 0;
            for (int c:count){
                res+=c*(c-1)/2;
            }
            return res;
        }


        public int backStrack(int count,int index,int[] A,int K,int sum){
            if (sum==K){
                return 1;
            }
            for (int i = index;i<A.length;i++){
                return count+backStrack(count,index+1,A,K,sum+A[i]);
            }

            return 0;
        }


    }
}
