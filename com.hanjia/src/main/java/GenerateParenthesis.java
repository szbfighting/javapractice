import java.util.ArrayList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/17 18:38
 * @Version 1.0
 */
public class GenerateParenthesis {

    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(0));
    }

    static class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> list = new ArrayList<>();
            backStrack(list,"",0,0,n);
            return list;
        }

        public void backStrack(List<String> list,String s,int left,int right,int n){
            if (left==n&&right==n){
                list.add(s);
            }else {
                if (left<n)
                    backStrack(list,s+"(",left+1,right,n);
                if (right<left)
                    backStrack(list,s+")",left,right+1,n);
            }
        }
    }
}
