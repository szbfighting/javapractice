/**
 * @Author 大狼狗skr~
 * @Date 2020/2/1 20:14
 * @Version 1.0
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] test = {9,9,9};
        test = new Solution().plusOne(test);
        for (int a:test){
            System.out.println(a);
        }
    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            int forward = 1,temp;
            for (int i = digits.length-1;i>=0;i--){
                temp = digits[i]+forward;
                digits[i] = temp%10;
                forward = temp/10;
            }

            if (forward>0){
                int[] res = new int[digits.length+1];
                res[0]=forward;
                for (int i = 1;i<res.length;i++){
                    res[i]=digits[i-1];
                }
                return res;
            }
            return digits;

        }
    }
}
