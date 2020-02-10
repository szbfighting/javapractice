/**
 * @Author 大狼狗skr~
 * @Date 2020/2/10 22:09
 * @Version 1.0
 */
public class PartitionDisjoint {

    public static void main(String[] args) {

        int[] test = {32,57,24,19,0,24,49,67,87,87};
        System.out.println(new Solution().partitionDisjoint(test));
    }

    static class Solution {
        public int partitionDisjoint(int[] A) {
            int i=0,max=0;
            for (int j = i+1;j<A.length;j++){
                if (A[j]<A[max]){
                    i=j;
                    max = findMax(A,i,max);
                }
            }
            return i+1;
        }

        public int findMax(int[] A,int end,int max){
            for (int i = 0;i<end;i++){
                if (A[i]>A[max])
                    max=i;
            }
            return max;
        }
    }
}
