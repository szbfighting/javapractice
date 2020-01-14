import java.util.Arrays;

public class MedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3};
        int[] nums2 = new int[]{-2,-1};
        System.out.println(new Solution().findMedianSortedArrays(nums1,nums2));
    }

    static class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] add = new int[nums1.length+nums2.length];
            int k = 0;
            for (int i:nums1){
                add[k++]=i;
            }
            for (int j:nums2){
                add[k++]=j;
            }
            Arrays.sort(add);
            if (add.length%2==1){
                return add[add.length/2];
            }else
                return (add[add.length/2-1]+add[add.length/2])/2.0;
        }
    }

    public double aTest(int[] nums1,int[] nums2){
        int i = nums1.length/2;
        int j = nums2.length/2;
        double result=0;
        if (nums1.length!=0) {
            if (nums1.length % 2 == 1) {
                result += nums1[i];
            } else
                result += ((nums1[i - 1] + nums1[i]) / 2.0);
        }
        if (nums2.length!=0) {
            if (nums2.length % 2 == 1) {
                result += nums2[j];
            } else
                result += ((nums2[j - 1] + nums2[j]) / 2.0);
        }
        if (nums1.length==0||nums2.length==0)
            return result;
        else
            return result/2.0;
    }
}


