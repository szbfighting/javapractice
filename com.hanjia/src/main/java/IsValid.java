import java.util.Stack;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/16 13:15
 * @Version 1.0
 */
public class IsValid {

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("{]}"));
    }

    static class Solution {
        public boolean isValid(String s) {
            boolean isValid = true;
            Stack<Character> stack = new Stack<>();
            for (int i =0;i<s.length();i++){
                if (!isValid) break;
                char ch = s.charAt(i);
                switch (ch){
                    case '(':
                    case '[':
                    case '{':
                        stack.push(ch);
                        break;
                    case ')':
                        if (stack.isEmpty()) {
                            isValid = false;
                        }else if (stack.peek()=='(')
                            stack.pop();
                        else
                            isValid=false;

                        break;

                    case '}':
                        if (stack.isEmpty()) {
                            isValid = false;
                        }else if (stack.peek()=='{')
                            stack.pop();
                        else
                            isValid=false;
                        break;
                    case ']':
                        if (stack.isEmpty()) {
                            isValid = false;
                            break;
                        }else if (stack.peek()=='[')
                            stack.pop();
                        else
                            isValid=false;
                        break;
                }
            }
            isValid = isValid?stack.isEmpty():isValid;
            return isValid;
        }
    }
}
