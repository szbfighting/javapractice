import java.util.ArrayList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/22 8:53
 * @Version 1.0
 */
public class CombinationSum {

    public static void main(String[] args) {

        int[] test = {2,5,2,1,2};
        List<List<Integer>> lists = new Solution().combinationSum(test,5);
        System.out.println(lists);
        System.out.println(lists.size());
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> nList = new ArrayList<>();
        nList.add(1);
        nList.add(3);
        nList.add(2);
        System.out.println(list.equals(nList));*/
    }

    static class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> lists = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            backStrack(lists,list,candidates,0,target,0);
            return lists;
        }

        public void backStrack(List<List<Integer>> lists,List<Integer> list,int[] nums,int sum,int target,int start){
            if (sum==target){
                list.sort(null);
                for (List<Integer> l:lists){
                    if (l.equals(list))
                        return;
                }
                lists.add(list);

            }else if (sum>target){
                return;
            }else{
                for (int i = start;i<nums.length;i++){
                    List<Integer> nList = new ArrayList<>(list);
                    nList.add(nums[i]);
                    backStrack(lists,nList,nums,sum+nums[i],target,i+1);
                }
            }
        }
    }
}


