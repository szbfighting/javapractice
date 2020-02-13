/**
 * @Author 大狼狗skr~
 * @Date 2020/2/13 13:00
 * @Version 1.0
 */
public class RemoveDuplicates2 {

    public static void main(String[] args) {
        int[] test = {0,0,1,1,1,1,2,3,3};
        System.out.println(new Solution().removeDuplicates(test));
        for (int n :
                test) {
            System.out.println(n);
        }

    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int count = 0,index = 0;
            for (int i = 0;i<nums.length;){
                nums[index++] = nums[i++];
                count++;
                while(i<nums.length&&nums[i]==nums[index-1]){
                    if (count<2){
                        nums[index++]=nums[i];
                        count++;
                    }
                    i++;
                }
                count = 0;
            }
            return index;
        }
    }
}
