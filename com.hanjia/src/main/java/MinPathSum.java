/**
 * @Author 大狼狗skr~
 * @Date 2020/2/12 13:59
 * @Version 1.0
 */
public class MinPathSum {

    public static void main(String[] args) {
        int[][] map = new int[][]{
                {1,2,5},
                {3,2,1},

        };
        System.out.println(new SolutionA().minPathSum(map));

    }

    static class Solution {

        public int minPathSum(int[][] grid) {
            return getMin(grid,0,0);
        }

        public int getMin(int[][] grid,int i,int j){
            if (i==grid.length||j==grid[0].length)
                return Integer.MAX_VALUE;
            if (i==grid.length-1&&j==grid[0].length-1)
                return grid[i][j];
            return grid[i][j]+Math.min(getMin(grid,i+1,j),getMin(grid,i,j+1));
        }
    }

    static class SolutionA{
        public int minPathSum(int[][] grid) {
            int m = grid.length,n = grid[0].length;
            int[][] minL = new int[m][n];
            for (int i = m-1;i>=0;i--){
                for (int j = n-1;j>=0;j--){
                    if (i==m-1&&j==n-1){
                        minL[i][j] = grid[i][j];
                    }else if (i==m-1){
                        minL[i][j] = grid[i][j]+minL[i][j+1];
                    }else if (j==n-1){
                        minL[i][j]= grid[i][j]+minL[i+1][j];
                    }else{
                        minL[i][j]=grid[i][j]+Math.min(minL[i][j+1],minL[i+1][j]);
                    }
                }
            }

            return minL[0][0];
        }
    }
}
