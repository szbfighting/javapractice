import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/2/13 12:36
 * @Version 1.0
 */
public class Combine {

    public static void main(String[] args) {
        System.out.println(new Solution().combine(4,2));
    }

    static class Solution {
        List<List<Integer>> result;
        public List<List<Integer>> combine(int n, int k) {
            result = new ArrayList<>();
            LinkedList<Integer> list = new LinkedList<>();
            backStrack(1,list,n,k);
            return result;
        }

        public void backStrack(int i, LinkedList<Integer> list, int n, int k){
            if (list.size() == k)
                result.add(new LinkedList<>(list));
            else {
                for (int j = i;j<n+1;j++){
                    list.add(j);
                    backStrack(j+1,list,n,k);
                    list.removeLast();
                }
            }
        }


    }
}
