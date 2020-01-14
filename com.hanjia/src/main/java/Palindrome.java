import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(2147483647));
        System.out.println(new Solution().isPalindrome(-121));
        System.out.println(new Solution().isPalindrome(121));
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x<0) return false;
            Integer f;
            try {
                f = Integer.valueOf(new StringBuilder(String.valueOf(x)).reverse().toString());
            }catch (NumberFormatException n){
                return false;
            }
            if (x==f)
                return true;
            return false;
        }
    }
}
