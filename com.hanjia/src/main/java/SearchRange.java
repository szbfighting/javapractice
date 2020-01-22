/**
 * @Author 大狼狗skr~
 * @Date 2020/1/22 8:28
 * @Version 1.0
 */
public class SearchRange {

    public static void main(String[] args) {

        int[] result = new Solution().searchRange(new int[]{5,7,7,8,10},6);
        for (int n:result)
            System.out.println(n);
    }

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int left = 0,right = nums.length-1;
            int[] result = new int[]{-1,-1};
            boolean flag = false;
            while(left<=right&&!flag) {
                if (nums[left] == target && result[0] == -1)
                    result[0] = left;
                if (nums[right] == target && result[1] == -1)
                    result[1] = right;
                if (result[0]==-1)
                    left++;
                if (result[1]==-1)
                    right--;
                if (result[0]!=-1&&result[1]!=-1)
                    flag=true;
            }
            return result;

        }
    }
}
