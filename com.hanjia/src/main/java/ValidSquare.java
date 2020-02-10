import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author 大狼狗skr~
 * @Date 2020/2/10 21:33
 * @Version 1.0
 */
public class ValidSquare {

    public static void main(String[] args) {

        int[] p1 = {1,1};
        int[] p2 = {5,3};
        int[] p3 = {3,5};
        int[] p4 = {7,7};
        System.out.println(new Solution().validSquare(p1,p2,p3,p4));

    }

    static class Solution {
        public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
            int[][] points = {p1,p2,p3,p4};
            Arrays.sort(points, (o1, o2) -> o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]);
            return getL(points[0],points[1])!=0&&getL(points[0],points[1])==getL(points[0],points[2])&&getL(points[0],points[1])==getL(points[2],points[3])&&getL(points[0],points[1])==getL(points[1],points[3])&&getL(points[0],points[3])==getL(points[2],points[1]);
        }

        public double getL(int[] p1,int[] p2){
            return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
        }
    }
}
