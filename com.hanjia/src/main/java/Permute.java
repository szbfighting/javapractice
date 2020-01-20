import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/20 16:23
 * @Version 1.0
 */
public class Permute {

    public static void main(String[] args) {

        int[] nums = {1,1,2};
        int[] num = {1,1,2};
        System.out.println(Arrays.equals(nums,num));
        //System.out.println(new Solution().permute(nums));
    }

    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            backStrack(lists,nums,0,nums.length);
            return lists;
        }

        public void backStrack(List<List<Integer>> lists,int[] nums,int start,int end){
            if (start == end-1){
                List<Integer> list = new ArrayList<>();

                for (int n:nums)
                    list.add(n);
                lists.add(list);
            }else {
                for (int i = start; i < end; i++) {
                    swap(nums, start, i);
                    backStrack(lists, nums, start + 1, end);
                    swap(nums, start, i);
                }
            }
        }

        private void swap(int[] nums, int start, int i) {

            int temp = nums[start];
            nums[start]=nums[i];
            nums[i]=temp;
        }
    }
}
