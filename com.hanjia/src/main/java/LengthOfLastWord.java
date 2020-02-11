/**
 * @Author 大狼狗skr~
 * @Date 2020/2/11 10:59
 * @Version 1.0
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = " ";
        System.out.println(new Solution().lengthOfLastWord(s));
    }

    static class Solution {
        public int lengthOfLastWord(String s) {
            String[] str = s.split(" ");
            if (str.length==0)
                return 0;
            return str[str.length-1].length();
        }
    }
}
