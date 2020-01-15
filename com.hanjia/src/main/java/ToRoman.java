import java.util.HashMap;
import java.util.Map;

public class ToRoman {

    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(1314));
    }

    static class Solution {
        public String intToRoman(int num) {

            int[] money = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
            String[] mString = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
            StringBuilder result = new StringBuilder();
            int index=0;
            while(num>0){
                if (num>=money[index]){
                    result.append(mString[index]);
                    num-=money[index];
                    index--;
                }
                index++;
            }

            return result.toString();
        }
    }
}
