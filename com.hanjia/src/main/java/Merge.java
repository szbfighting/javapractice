/**
 * @Author 大狼狗skr~
 * @Date 2020/2/7 10:54
 * @Version 1.0
 */
public class Merge {

    public static void main(String[] args) {
        int[][] test = {{1,4},{4,5}};
        test = (new Solution().merge(test));
        for (int[] t:test){
            for (int a:t){
                System.out.print(a+" ");
            }
        }
    }

    static class Solution {
        public int[][] merge(int[][] intervals) {
            int length = intervals.length;
            if(length <= 1){
                return intervals;
            }
            QuickSort(intervals,0,length-1);

            int start = intervals[0][0] ;
            int end = intervals[0][1] ;
            int newLength = 0;
            for (int i = 1; i < length; i++) {
                if(intervals[i][1] < end){
                    continue;
                }else if(intervals[i][0] <= end){
                    end = intervals[i][1];
                }else{
                    intervals[newLength][0] = start;
                    intervals[newLength][1] = end;
                    start = intervals[i][0];
                    end = intervals[i][1];
                    newLength++;
                }
            }
            intervals[newLength][0] = start;
            intervals[newLength][1] = end;

            int[][] newIntervals = new int[newLength+1][2];
            for (int i = 0; i < newIntervals.length; i++) {
                newIntervals[i][0] = intervals[i][0];
                newIntervals[i][1] = intervals[i][1];
            }
            return newIntervals;
        }

        public int PartSort(int arr[][], int low, int high) {
            int data = arr[low][0];
            int dataTmp = arr[low][1];
            while (low < high) {
                while (low < high && arr[high][0] >= data) {
                    high--;
                }
                arr[low][0] = arr[high][0];
                arr[low][1] = arr[high][1];
                while (low < high && arr[low][0] <= data) {
                    low++;
                }
                arr[high][0] = arr[low][0];
                arr[high][1] = arr[low][1];
            }
            arr[low][0] = data;
            arr[low][1] = dataTmp;
            return low;
        }

        public void QuickSort(int arr[][], int low, int high) {
            if(low<high) {
                int index = PartSort(arr, low, high);
                QuickSort(arr, low, index - 1);
                QuickSort(arr, index + 1, high);
            }
        }


    }
}
