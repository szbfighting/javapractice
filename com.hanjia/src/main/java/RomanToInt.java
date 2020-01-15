public class RomanToInt {

    public static void main(String[] args) {

        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
//"1000M","900CM","500D","400CD","100C","90XC","50L","40XL","10X","9IX","5V","4IV","1I"
    static class Solution {
        public int romanToInt(String s) {
            int sum = 0;
            for (int i = s.length()-1;i>=0;i--){
                switch (s.charAt(i)){
                    case 'I':
                        sum+=1;
                        break;
                    case 'V':
                        if (i>0&&s.charAt(i-1)=='I') {
                            sum += 4;
                            i--;
                        }
                        else
                            sum+=5;
                        break;
                    case 'X':
                        if (i>0&&s.charAt(i-1)=='I') {
                            sum += 9;
                            i--;
                        }
                        else
                            sum+=10;
                        break;
                    case 'L':
                        if (i>0&&s.charAt(i-1)=='X') {
                            sum += 40;
                            i--;
                        }
                        else
                            sum+=50;
                        break;
                    case 'C':
                        if (i>0&&s.charAt(i-1)=='X') {
                            sum += 90;
                            i--;
                        }
                        else
                            sum+=100;
                        break;
                    case 'D':
                        if (i>0&&s.charAt(i-1)=='C') {
                            sum += 400;
                            i--;
                        }
                        else
                            sum+=500;
                        break;
                    case 'M':
                        if (i>0&&s.charAt(i-1)=='C') {
                            sum += 900;
                            i--;
                        }
                        else
                            sum+=1000;
                        break;
                }
            }

            return sum;
        }
    }
}
