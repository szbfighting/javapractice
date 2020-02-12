/**
 * @Author 大狼狗skr~
 * @Date 2020/2/12 8:14
 * @Version 1.0
 */
public class UniquePaths {

    public static void main(String[] args) {

        System.out.println(new SolutionY().uniquePaths(4,3));
    }

    static class Solution {
        public int uniquePaths(int m, int n) {
            return getJie(m+n-2,m)/getJie(n-1,1);
        }

        public int getJie(int n,int k){
            if (n==k)
                return k;
            return n*getJie(n-1,k);
        }
    }

    static class SolutionY {
        public int uniquePaths(int m, int n) {
            int[][] map = new int[m][n];
            for (int i = 0;i<m;i++)
                map[i][0]=1;
            for (int j = 0;j<n;j++)
                map[0][j]=1;
            for (int i = 1;i<m;i++){
                for (int j = 1;j<n;j++){
                    map[i][j]=map[i-1][j]+map[i][j-1];
                }
            }

            return map[m-1][n-1];
        }
    }
}
