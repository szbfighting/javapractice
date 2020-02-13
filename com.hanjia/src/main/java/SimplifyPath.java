import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/2/13 11:38
 * @Version 1.0
 */
public class SimplifyPath {

    public static void main(String[] args) {
        String s = "/../";
        System.out.println(new Solution().simplifyPath(s));
    }

    static class Solution {
        public String simplifyPath(String path) {
            String regex = "/";
            String[] paths = path.split(regex);
            LinkedList<String> list = new LinkedList<>();
            for (String s:paths){
                if (s.equals(".")){
                    continue;
                }else if (s.equals("..")){
                    if (!list.isEmpty())
                        list.removeLast();
                }else if (s.length() != 0){
                    list.add(s);
                }
            }
            StringBuilder builder = new StringBuilder();
            for (String s:list){
                builder.append("/"+s);
            }
            if (builder.length()==0)
                builder.append("/");
            return builder.toString();
        }
    }
}
