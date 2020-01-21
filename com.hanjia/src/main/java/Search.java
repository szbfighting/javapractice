/**
 * @Author 大狼狗skr~
 * @Date 2020/1/21 12:59
 * @Version 1.0
 */
public class Search {

    public static void main(String[] args) {
        //System.out.println(find_rotate_index(new int[]{8,9,2,3,4},0,4));
        System.out.println(new Solution().search(new int[]{8,9,2,3,4},9));
    }
    public static int find_rotate_index(int[] nums,int left, int right) {
        if (nums[left] < nums[right])
            return 0;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (nums[pivot] > nums[pivot + 1])
                return pivot + 1;
            else {
                if (nums[pivot] < nums[left])
                    right = pivot - 1;
                else
                    left = pivot + 1;
            }
        }
        return 0;
    }

    static class Solution {
        public int search(int[] nums, int target) {
            if (nums==null||nums.length==0)
                return -1;
            int n = findMin(nums);
            int index;
            if (n==0)
                index = searchNum(nums,0,nums.length-1,target);
            else {
                index = searchNum(nums, 0, n - 1, target);
                index = index == -1 ? searchNum(nums, n, nums.length - 1, target) : index;
            }
            return index;
        }

        public int searchNum(int[] num,int left,int right,int target){
            while(left<=right){
                int mid = (left+right)/2;

                if (num[mid]==target)
                    return mid;

                if (num[mid]>target){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }

            return -1;
        }

        public int findMin(int[] nums){
            int left = 0;
            int right = nums.length-1;
            if (left==right)
                return 0;
            if (nums[left]<nums[right])
                return 0;
            while(left<=right){
                int mid = (left+right)/2;
                if(nums[mid]>nums[mid+1])
                    return mid+1;
                else {
                    if (nums[mid] >= nums[left]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return 0;
        }
    }


    static class nSolution {
        int [] nums;
        int target;

        public int find_rotate_index(int left, int right) {
            if (nums[left] < nums[right])
                return 0;

            while (left <= right) {
                int pivot = (left + right) / 2;
                if (nums[pivot] > nums[pivot + 1])
                    return pivot + 1;
                else {
                    if (nums[pivot] < nums[left])
                        right = pivot - 1;
                    else
                        left = pivot + 1;
                }
            }
            return 0;
        }

        public int search(int left, int right) {
    /*
    Binary search
    */
            while (left <= right) {
                int pivot = (left + right) / 2;
                if (nums[pivot] == target)
                    return pivot;
                else {
                    if (target < nums[pivot])
                        right = pivot - 1;
                    else
                        left = pivot + 1;
                }
            }
            return -1;
        }

        public int search(int[] nums, int target) {
            this.nums = nums;
            this.target = target;

            int n = nums.length;

            if (n == 0)
                return -1;
            if (n == 1)
                return this.nums[0] == target ? 0 : -1;

            int rotate_index = find_rotate_index(0, n - 1);

            // if target is the smallest element
            if (nums[rotate_index] == target)
                return rotate_index;
            // if array is not rotated, search in the entire array
            if (rotate_index == 0)
                return search(0, n - 1);
            if (target < nums[0])
                // search in the right side
                return search(rotate_index, n - 1);
            // search in the left side
            return search(0, rotate_index);
        }
    }

}
