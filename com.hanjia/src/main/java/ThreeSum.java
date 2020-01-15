import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] test = {-1, 0, 1, 2, -1, -4};
        System.out.println(new Solution().threeSum(test));

    }

    static class Solution {


        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0;i<nums.length;i++){
                if (nums[i]>0) break;
                if (i>0&&nums[i]==nums[i-1])
                    continue;
                int L = i+1;
                int R = nums.length-1;
                while(L<R){
                    if (nums[i]+nums[L]+nums[R]==0){
                        lists.add(Arrays.asList(nums[i],nums[L],nums[R]));
                        while(L<R&&nums[L]==nums[L+1]) L++;
                        while(L<R&&nums[R]==nums[R-1]) R--;
                        L++;
                        R--;
                    }else if (nums[i]+nums[L]+nums[R]<0){
                        L++;

                    }else if (nums[i]+nums[L]+nums[R]>0)
                        R--;

                }


            }
            return lists;
        }

    }
}
