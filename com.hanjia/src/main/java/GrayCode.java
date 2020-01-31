import java.util.ArrayList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/31 9:10
 * @Version 1.0
 */
public class GrayCode {

    public static void main(String[] args) {
        System.out.println(new Solution().grayCode(0));
    }

    static class Solution {
        public List<Integer> grayCode(int n) {
            List<Integer> result = new ArrayList<Integer>(){{add(0);}};
            int head= 1;
            for (int i = 0;i<n;i++){
                for (int j = result.size()-1;j>=0;j--){
                    result.add(head+result.get(j));
                }
                head<<=1;
            }
            return result;
        }


    }
}
