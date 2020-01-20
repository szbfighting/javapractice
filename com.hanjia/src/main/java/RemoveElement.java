/**
 * @Author 大狼狗skr~
 * @Date 2020/1/20 11:58
 * @Version 1.0
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] num = new int[]{0,1,2,2,3,0,4,2};
        int n = new Solution().removeElement(num,2);
        for (int i = 0;i<n;i++)
            System.out.println(num[i]);

    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int count = 0;
            for (int i = 0;i<nums.length;i++){
                if (nums[i]!=val)
                    nums[count++]=nums[i];
            }

            return count;
        }
    }
}
