/**
 * @Author 大狼狗skr~
 * @Date 2020/2/13 12:26
 * @Version 1.0
 */
public class SortColors {

    public static void main(String[] args) {
        int[] nums = {0,1,0,2,1,0,1,2};
        new Solution().sortColors(nums);
        for (int n :
                nums) {
            System.out.print(n+" ");
        }
    }

    static class Solution {
        public void sortColors(int[] nums) {
            int p0 = 0,p2 = nums.length-1,curr = 0;
            while (curr<=p2){
                if (nums[curr]==0){
                    int temp = nums[p0];
                    nums[p0] = nums[curr];
                    nums[curr] = temp;
                    p0++;
                    curr++;//因为curr左边的值已经扫描过了，所以curr++
                }else if (nums[curr]==2){
                    int temp = nums[p2];
                    nums[p2] = nums[curr];
                    nums[curr] = temp;
                    p2--;
                    //curr后边的值没有扫描，所以不curr++
                }else{
                    curr++;
                }
            }
        }
    }
}
