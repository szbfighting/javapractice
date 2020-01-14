public class MaxArea {

    public static void main(String[] args) {
        int[] test = {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(test));
    }

    static class Solution {
        public int maxArea(int[] height) {
            int max = 0;
            for (int i = 0;i<height.length;i++){
                for (int j = i+1;j<height.length;j++){
                    int k = (height[i]>height[j]?height[j]:height[i])*(j-i);
                    if (k>max){
                        max=k;
                    }
                }
            }

            return max;
        }
    }
}


