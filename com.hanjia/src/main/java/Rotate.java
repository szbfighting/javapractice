/**
 * @Author 大狼狗skr~
 * @Date 2020/2/18 8:14
 * @Version 1.0
 */
public class Rotate {
    public static void main(String[] args) {
        int[][] test = {

        };

        new Solution().rotate(test);
        for (int i = 0;i<test.length;i++){
            for (int j = 0;j<test[i].length;j++){
                System.out.print(test[i][j]+" ");
            }
            System.out.println();
        }
    }

    static class Solution {
        public void rotate(int[][] matrix) {
            int i = 0,j = matrix.length-1;
            while(i<=j){
                int[] temp = matrix[i];
                matrix[i] = matrix[j];
                matrix[j] = temp;
                i++;
                j--;
            }

            for (i = 0;i<matrix.length;i++){
                for (j = i;j<matrix[i].length;j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

        }
    }
}
