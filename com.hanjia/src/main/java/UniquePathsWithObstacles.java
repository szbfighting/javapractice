/**
 * @Author 大狼狗skr~
 * @Date 2020/2/12 8:53
 * @Version 1.0
 */
public class UniquePathsWithObstacles {

    public static void main(String[] args) {
        int[][] map = {{1,0}};
        System.out.println(new Solution().uniquePathsWithObstacles(map));

    }

    static class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] map = new int[m][n];
            for (int i = 0;i<m;i++){
                if (obstacleGrid[i][0]==1) {
                    map[i][0] = 0;
                    break;
                }
                else
                    map[i][0]=1;
            }
            for (int i = 0;i<n;i++){
                if (obstacleGrid[0][i]==1) {
                    map[0][i] = 0;
                    break;
                }
                else
                    map[0][i]=1;
            }

            for (int i = 1;i<m;i++){
                for (int j = 1;j<n;j++){
                    if (obstacleGrid[i][j]==1){
                        map[i][j]=0;
                    }else{
                        map[i][j]=map[i-1][j]+map[i][j-1];
                    }
                }
            }
            return map[m-1][n-1];
        }

    }
}
