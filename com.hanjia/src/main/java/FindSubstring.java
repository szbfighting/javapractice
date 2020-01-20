import java.util.ArrayList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/20 12:26
 * @Version 1.0
 */
public class FindSubstring {
    public static void main(String[] args) {
        String[] words = {"foo","bar"};
        String s = "foobarfoobar";
        List<Integer> list = new Solution().findSubstring(s,words);
        System.out.println(list);

    }

    static class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            List<String> list = new ArrayList<>();
            List<Integer> listInteger = new ArrayList<>();
            stringBack(list,words,0,words.length);
            for (String l:list){
                String p =s;
                while (p.contains(l)) {
                    int n = p.indexOf(l);
                    listInteger.add(n+s.length()-p.length());
                    p=p.substring(n+l.length());
                }

            }
            return listInteger;
        }

        public  void stringBack(List<String> list,String[] words,int start,int end){
            if (start==end-1){
                StringBuilder s = new StringBuilder("");
                for (String l:words)
                    s.append(l);
                if (!list.contains(s.toString()))
                    list.add(s.toString());
            }else {
                for (int i = start; i < end; i++) {
                    swap(words, start, i);
                    stringBack(list, words, start + 1, end);
                    swap(words, start, i);
                }
            }
        }

        public  void swap(String[] words, int start, int i) {
            String temp = words[start];
            words[start]=words[i];
            words[i]=temp;
        }
    }


}
