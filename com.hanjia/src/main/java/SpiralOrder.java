import java.util.ArrayList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/23 12:57
 * @Version 1.0
 */
public class SpiralOrder {

    public static void main(String[] args) {

        int[][] test = new int[][]{

        };

        System.out.println(new Solution().spiralOrder(test));

    }

    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {

            List<Integer> list = new ArrayList<>();
            if (matrix.length==0) return list;
            int R = matrix.length;
            int C = matrix[0].length;
            boolean[][] isRun = new boolean[R][C];
            int r=0,c=0,ad=0;
            int[] row = {0,1,0,-1};
            int[] lie = {1,0,-1,0};
            for (int i = 0;i<R*C;i++){
                list.add(matrix[r][c]);
                isRun[r][c] = true;
                int tr = r+row[ad];
                int tc = c+lie[ad];
                if (0<=tr&&tr<R&&0<=tc&&tc<C&&!isRun[tr][tc]){
                    r=tr;
                    c=tc;
                }else{
                    ad=(ad+1)%4;
                    r=r+row[ad];
                    c=c+lie[ad];
                }
            }
            return list;

        }
    }
}
