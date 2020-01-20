/**
 * @Author 大狼狗skr~
 * @Date 2020/1/20 11:29
 * @Version 1.0
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] num = new int[]{1,1,2};
        int n = new Solution().removeDuplicates(num);
        for (int i = 0;i<n;i++)
            System.out.println(num[i]);
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int count=0;
            for (int i = 0;i<nums.length;){
                nums[count]=nums[i];
                while(i<nums.length&&nums[i]==nums[count])
                    i++;
                count++;
            }

            return count;
        }
    }
}
