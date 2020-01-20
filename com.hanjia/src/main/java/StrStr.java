/**
 * @Author 大狼狗skr~
 * @Date 2020/1/20 12:06
 * @Version 1.0
 */
public class StrStr {
    public static void main(String[] args) {

        System.out.println(new Solution().strStr("aaaa","bba"));
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            for (int i = 0;i<haystack.length()-needle.length()+1;i++){
                int j = i;
                if (haystack.substring(j,j+needle.length()).equals(needle))
                    return i;
            }
            return -1;
        }
    }
}
