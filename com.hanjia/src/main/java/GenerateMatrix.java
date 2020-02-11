/**
 * @Author 大狼狗skr~
 * @Date 2020/2/11 11:05
 * @Version 1.0
 */
public class GenerateMatrix {

    public static void main(String[] args) {

        int[][] map = new Solution().generateMatrix(2);
        for (int i = 0;i<map.length;i++){
            for (int j = 0;j<map[i].length;j++){
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static class Solution {
        public int[][] generateMatrix(int n) {
            int[][] directions = {
                    {0,1},
                    {1,0},
                    {0,-1},
                    {-1,0}
            };
            int[][] map = new int[n][n];
            int index = 0;
            int[] direction = {0,0};
            for (int i = 1;i<=n*n;i++){
                map[direction[0]][direction[1]]=i;
                int r= direction[0]+directions[index][0];
                int c = direction[1]+directions[index][1];
                if (0<=r&&r<n&&0<=c&&c<n&&map[r][c]==0){
                    direction[0] = r;
                    direction[1] = c;
                }else{
                    index = (index+1)%4;
                    direction[0] = direction[0]+directions[index][0];
                    direction[1] = direction[1]+directions[index][1];
                }

            }

            return map;
        }
    }
}
