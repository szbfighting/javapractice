/**
 * @Author 大狼狗skr~
 * @Date 2020/2/13 12:14
 * @Version 1.0
 */
public class SearchMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {}
        };
        System.out.println(new Solution().searchMatrix(matrix,1));

    }

    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix.length==0||matrix[0].length==0) return false;
            for (int i = 0;i<matrix.length;i++){
                if (target<=matrix[i][matrix[i].length-1]){
                    return binarySearch(matrix[i],target);
                }
            }
            return false;
        }

        private boolean binarySearch(int[] matrix, int target) {
            int i = 0,j = matrix.length-1;
            while(i<=j){
                int mid = (i+j)/2;
                if (matrix[mid]<target){
                    i=mid+1;
                }else if (matrix[mid]>target){
                    j=mid-1;
                }else
                    return true;
            }
            return false;
        }
    }
}
