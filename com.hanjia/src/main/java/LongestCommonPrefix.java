public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] test = {"alow","blow","clow"};
        System.out.println(new Solution().longestCommonPrefix(test));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs==null||strs.length==0) return "";
            for (String l:strs)
                if (l==null||l.length()==0)
                    return "";
            String s = strs[0];
            while(true){
                int i;
                for (i = 1;i<strs.length;i++){
                    if (!strs[i].startsWith(s))
                        break;
                }
                if (i== strs.length)
                    break;
                s=s.substring(0,s.length()-1);
            }
            return s;
        }
    }
}
