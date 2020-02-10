import java.util.*;

/**
 * @Author 大狼狗skr~
 * @Date 2020/2/10 22:34
 * @Version 1.0
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] test = {2,2,1};
        System.out.println(new Solution().singleNumber(test));
    }

    static class Solution {
        public int singleNumber(int[] nums) {
            Integer[] numsArray = new Integer[nums.length];
            int sum = 0;
            for (int i = 0;i<nums.length;i++) {
                sum+=nums[i];
                numsArray[i] = nums[i];
            }

            Set<Integer> set = new HashSet<>(Arrays.asList(numsArray));
            Iterator iterator = set.iterator();
            while(iterator.hasNext()){
                sum-=(Integer)iterator.next()*2;
            }

            return 0-sum;
        }
    }
}
