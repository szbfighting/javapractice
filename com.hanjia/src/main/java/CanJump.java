import java.util.ArrayList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/23 13:38
 * @Version 1.0
 */
public class CanJump {

    public static void main(String[] args) {

        int[] test = {1,2,3};
        System.out.println(new Solution().canJump(test));
    }

    static class Solution {
        public boolean canJump(int[] nums) {
            List<String> list = new ArrayList<>();
            backStrack(list,nums,nums[0],0,"");
            System.out.println(list);
            return !list.isEmpty();
        }

        public void backStrack(List<String> list,int[] nums,int p,int step,String s){
            if (step == nums.length-1)
                list.add(s);
            else if (p==0)
                return;
            else {
                for (int i = 1; i <= p && i < nums.length; i++) {
                    int l = i+step;
                    if (l<nums.length)
                        backStrack(list,nums, nums[l], l,s+p+l+"->");
                }
            }


        }
    }
}
