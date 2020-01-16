import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FourSum {

    public static void main(String[] args) {
        int[] test2 = new int[]{-2,0,-4,-8,-2,-2};
        int[] test1 = new int[]{-2,-5,-5,0,-8,-3,-4,-4,-2,-2};
        int[] test = new int[]{2,1,0,-1};
        System.out.println(new Solution().fourSum(test,2));

    }

    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> lists = new ArrayList<>();
            ArrayList<Integer> list = new ArrayList<>();
            Arrays.sort(nums);
            if (nums.length==0)return lists;
            if (nums[nums.length-1]<0&&target>0)
                return lists;
            if (nums[0]>0&&target<0)
                return lists;
            backStrack(lists,nums,target,list);
            return lists;
        }

        public void backStrack(List<List<Integer>> lists, int[] nums, int target, ArrayList<Integer> list){
            if (target==0) {
                if (list.size() == 4&&judge(lists,list))
                lists.add(list);
            }
            if (nums==null){
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                ArrayList<Integer> newL = new ArrayList<>(list);
                newL.add(nums[i]);
                backStrack(lists, subNum(nums,i), target - nums[i], newL);
            }
        }

        public boolean judge(List<List<Integer>> lists,List<Integer> list){

            for (List<Integer> list1:lists){
                if (list1.containsAll(list)&&list.containsAll(list1)){
                    return false;
                }
            }
            return true;
        }

        public int[] subNum(int[] nums,int j){
            if (nums.length==0||nums.length==1) return null;
            int[] num = new int[nums.length-1-j];
            for (int i = j+1;i<nums.length;i++){
                num[i-1-j]=nums[i];
            }

            return num;
        }
    }
}
