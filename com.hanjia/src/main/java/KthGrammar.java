/**
 * @Author 大狼狗skr~
 * @Date 2020/2/3 10:36
 * @Version 1.0
 */
public class KthGrammar {

    public static void main(String[] args) {
        //System.out.println(new Solution().kthGrammar(30,1));

        System.out.println(Integer.bitCount(5));
    }

    static class Solution {
        public int kthGrammar(int N, int K) {
            String s = getNString(N);
            return s.charAt(K-1)-48;
        }

        private String getNString(int n) {
            StringBuilder s = new StringBuilder("0");
            for (int i = 1;i<n;i++){
                s.append(getContrary(new StringBuilder(s)));
            }
            return s.toString();
        }

        private StringBuilder getContrary(StringBuilder s) {
            for (int i = 0;i<s.length();i++){
                if (s.charAt(i)=='0'){
                    s.setCharAt(i,'1');
                }else if (s.charAt(i)=='1'){
                    s.setCharAt(i,'0');
                }
            }

            return s;
        }
    }
}
