public class Match {
    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("mississippi","mis*is*p*."));
    }

    /*static class Solution {
        public boolean isMatch(String s, String p) {
            int k =0;
            String[] l = p.split("\\*");
            for (int i = 0;i<l.length;i++){
                for (int j = 0;j<l[i].length();j++){
                    if (l[i].charAt(j)==s.charAt(k)){
                        k++;
                    }
                }

                if (k==l[i].length()-1){

                }
            }
        }
    }*/
    static class Solution {
        public boolean isMatch(String text, String pattern) {
            if (pattern.isEmpty()) return text.isEmpty();
            boolean first_match = (!text.isEmpty() &&
                    (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

            if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
                return (isMatch(text, pattern.substring(2)) ||
                        (first_match && isMatch(text.substring(1), pattern)));
            } else {
                return first_match && isMatch(text.substring(1), pattern.substring(1));
            }
        }
    }


}
