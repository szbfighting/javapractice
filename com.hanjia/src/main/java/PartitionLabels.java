import java.util.ArrayList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/2/1 20:37
 * @Version 1.0
 */
public class PartitionLabels {

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> list = new Solution().partitionLabels(s);
        for (int a:list){
            System.out.print(a+" ");
        }
    }

    static class Solution {
        public List<Integer> partitionLabels(String S) {
            int[] maxIndex = new int[26];
            //找出字母在字符串中出现的最大坐标
            for (int i = 0;i<S.length();++i){
                maxIndex[S.charAt(i)-'a'] = i;
            }
            int start = 0,end = 0;
            List<Integer> res = new ArrayList<>();
            for (int i = 0;i<S.length();++i){
                end = Math.max(end,maxIndex[S.charAt(i)-'a']);
                if (end == i){
                    res.add(end-start+1);
                    start = i+1;
                }
            }

            return res;
        }
    }
}
