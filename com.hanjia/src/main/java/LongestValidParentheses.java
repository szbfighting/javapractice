import java.util.Stack;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/21 12:05
 * @Version 1.0
 */
public class LongestValidParentheses {

    public static void main(String[] args) {
        System.out.println(new Solution().longestValidParentheses("(()"));
    }

    static class Solution {
        public int longestValidParentheses(String s) {
            int left = 0,right = 0,max=0;
            for (int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                switch (ch){
                    case '(':
                        left++;
                        break;
                    case ')':
                        right++;
                        break;
                }

                if (left==right){
                    max = max > left+right?max:left+right;
                }else if (right>left){
                    left=0;
                    right=0;
                }
            }

            left = 0;
            right = 0;
            for (int i = s.length()-1;i>=0;i--){
                char ch = s.charAt(i);
                switch (ch){
                    case '(':
                        left++;
                        break;
                    case ')':
                        right++;
                        break;
                }

                if (left==right){
                    max = max > left+right?max:left+right;
                }else if (left>right){
                    left=0;
                    right=0;
                }
            }
            return max;
        }
    }
}
