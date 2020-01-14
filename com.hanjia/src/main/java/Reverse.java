import java.math.BigInteger;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123090));
    }

    static class Solution {
        public int reverse(int x) {
            String s = String.valueOf(x);
            boolean flag = false;
            if (x<0){
                flag = true;
                s=s.substring(1,s.length());
            }
            StringBuilder L= new StringBuilder(s);
            L.reverse();
            BigInteger bi;
            if (flag){
                bi = BigInteger.valueOf(Long.valueOf(L.toString())).negate();
            }else
                bi = BigInteger.valueOf(Long.valueOf(L.toString()));

            if (bi.compareTo(BigInteger.valueOf(Long.valueOf(String.valueOf(Integer.MAX_VALUE))))>0||bi.compareTo(BigInteger.valueOf(Long.valueOf(String.valueOf(Integer.MIN_VALUE))))<0){
                return 0;
            }else
                return bi.intValue();
        }
    }
}

