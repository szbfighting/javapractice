import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("234"));
    }

    static class Solution {
        public List<String> letterCombinations(String digits) {
            if (digits==null||digits.length()==0) return null;
            Map<String,String> map = new HashMap<>();
            initMap(map);
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0;i<digits.length();i++){
                strings.add(map.get(digits.charAt(i)));
            }
            List<String> result = new ArrayList<>();
            backStrack(map,result,"",digits);
            return result;
        }

        private void backStrack(Map<String, String> map, List<String> result, String s, String digits) {
            if (digits.length()==0){
                result.add(s);
            }else{
                String ch = digits.substring(0,1);
                String l = map.get(ch);
                for (int i = 0;i<l.length();i++){
                    String p = l.substring(i,i+1);
                    backStrack(map,result,s+p,digits.substring(1));
                }
            }
        }


        private void initMap(Map<String,String> map) {
            map.put("2","abc");
            map.put("3","def");
            map.put("4","ghi");
            map.put("5","jkl");
            map.put("6","mno");
            map.put("7","pqrs");
            map.put("8","tuv");
            map.put("9","wxyz");
        }
    }
}
