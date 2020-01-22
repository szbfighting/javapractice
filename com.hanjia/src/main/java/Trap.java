/**
 * @Author 大狼狗skr~
 * @Date 2020/1/22 11:44
 * @Version 1.0
 */
public class Trap {

    public static void main(String[] args) {

        System.out.println(new Solution().trap(new int[]{3,2,4,4,5,0,1}));

    }

    static class Solution {
        public int trap(int[] height) {
            int max =0;
            int minHeight=0;
            for (int i = 0;i<height.length;){
                int k = i+1;
                int count=0;
                while(k<height.length&&height[k]<height[i]){
                    count+=height[k];
                    //minHeight = height[k]>height[i]?height[i]:height[k];
                    k++;
                }

                if (k<height.length&&height[k]>=height[i]) {
                    minHeight = height[k]>height[i]?height[i]:height[k];
                    max += (minHeight * (k - i - 1) - count);
                    i=k;
                }
                else{
                    minHeight = height[k]>height[i]?height[i]:height[k];
                    max += (minHeight * (k - i - 1) - count);
                    i=k;
                }
                    i++;

            }

            return max;
        }
    }
}
