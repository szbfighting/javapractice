import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/2/11 10:14
 * @Version 1.0
 */
public class Insert {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] interval = {2,5};
        intervals = new Solution().insert(intervals,interval);
        for (int i = 0;i<intervals.length;i++){
            System.out.print("[");
            for (int j = 0;j<intervals[i].length;j++){
                System.out.print(""+intervals[i][j]+" ");
            }
            System.out.println("]");
        }
    }

    static class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            LinkedList<int[]> result = new LinkedList<>();
            int index = 0;
            int start = newInterval[0];
            int end = newInterval[1];
            while(index<intervals.length&&intervals[index][0]<start)
                result.add(intervals[index++]);
            if (result.isEmpty()||result.getLast()[1]<start) {
                result.add(newInterval);
            }else{
                int[] interval = result.removeLast();
                interval[1] = Math.max(interval[1],end);
                end = interval[1];
                result.add(interval);
            }

            while(index<intervals.length){

                if (intervals[index][0]<=end){
                    int[] interval = result.removeLast();
                    interval[1]= Math.max(interval[1],intervals[index][1]);
                    end = interval[1];
                    result.add(interval);
                }else{
                    result.add(intervals[index]);
                }
                index++;
            }

            return result.toArray(new int[result.size()][2]);
        }
    }
}
