import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/23 15:20
 * @Version 1.0
 */
public class GetPermutation {

    public static void main(String[] args) {

        System.out.println(new Solution().getPermutation(5,2));

    }

    static class Solution {
        public String getPermutation(int n, int k) {
            List<Integer> lists = new ArrayList<>();
            int[] nums = new int[n];
            for (int i = 1;i<=n;i++)
                nums[i-1] = i;
            backStrack(lists,nums,0,nums.length);

            lists.sort(null);
            System.out.println(lists);
            return lists.get(k-1).toString();

        }

        public void backStrack(List<Integer> lists,int[] nums,int start,int end){
            if (start==end-1){
                StringBuilder s = new StringBuilder("");
                for (int n:nums)
                    s.append(n);
                lists.add(Integer.valueOf(s.toString()));
            }else {
                for (int i = start; i < nums.length; i++) {
                    swap(nums, start, i);
                    backStrack(lists, nums, start + 1, end);
                    swap(nums, start, i);
                }
            }
        }

        public void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j] =temp;
        }
    }
}
