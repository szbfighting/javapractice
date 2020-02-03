/**
 * @Author 大狼狗skr~
 * @Date 2020/2/3 8:57
 * @Version 1.0
 */
public class IntegerReplacement {

    public static void main(String[] args) {
        System.out.println(new Solution().integerReplacement(2));
    }

    static class Solution {
        public int integerReplacement(int n) {
            if (n==1){
                return 0;
            }else if (n%2==0){
                return integerReplacement(n/2)+1;
            }else if (n%2==1){
                int a = integerReplacement(n+1)+1;
                int b = integerReplacement(n-1)+1;
                if (a<b)
                    return a;
                else
                    return b;
            }
            return 0;
        }
    }
}
