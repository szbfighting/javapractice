/**
 * @Author 大狼狗skr~
 * @Date 2020/2/12 15:53
 * @Version 1.0
 */
public class AddBinary {

    public static void main(String[] args) {


        System.out.println(new Solution().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }


    static class Solution {
        public String addBinary(String a, String b) {


            return Integer.toBinaryString(Integer.valueOf(a,2)+Integer.valueOf(b,2));
        }
    }

}
