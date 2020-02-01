/**
 * @Author 大狼狗skr~
 * @Date 2020/2/1 20:51
 * @Version 1.0
 */
public class CircularArrayLoop {
    public static void main(String[] args) {
        int[] test = new int[]{-2,1,-1,-2,-2};
        System.out.println(new Solution().circularArrayLoop(test));
    }

    static class Solution {
        public boolean circularArrayLoop(int[] nums) {
            boolean flag,circle;
            int start,end;
            for (int i = 0;i<nums.length;i++){
                flag = true;
                circle = false;
                start = i;
                end = i;
                while(flag){
                    if (nums[end]>0) {
                        if (nums[end] * nums[(end + nums[end]) % nums.length] < 0) {
                            flag = false;
                        } else {
                            end = (end + nums[end]) % nums.length;
                        }
                    }else{
                        if (nums[end] * nums[(end + nums[end]) % nums.length] < 0) {
                            flag = false;
                        } else {
                            end = (end + nums[end]) % nums.length;
                        }
                    }
                    if (end==start)
                        break;
                }
                if (flag == true){
                    return true;
                }
            }
            return false;
        }
    }
}
