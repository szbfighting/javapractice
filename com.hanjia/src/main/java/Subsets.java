import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/2/13 12:48
 * @Version 1.0
 */
public class Subsets {

    public static void main(String[] args) {

        int[] list = {1,2,3};
        System.out.println(new Solution().subsets(list));
    }

    static class Solution {
        List<List<Integer>> result;
        public List<List<Integer>> subsets(int[] nums) {
            result = new ArrayList<>();
            LinkedList<Integer> list = new LinkedList<>();
            backStrack(0,nums,list);
            return result;

        }

        public void backStrack(int start,int[] nums,LinkedList<Integer> list){
            result.add(new LinkedList<>(list));
            for (int i = start;i<nums.length;i++){
                list.add(nums[i]);
                backStrack(i+1,nums,list);
                list.removeLast();
            }
        }
    }
}
