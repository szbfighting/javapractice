/**
 * @Author 大狼狗skr~
 * @Date 2020/2/19 11:10
 * @Version 1.0
 * 一维多项式求解
 * p(x) = a(n-1)x^(n-1)+a(n-2)x^(n-2)+....a1x+a0
 * p(x) = (...((a(n-1)x+a(n-2)x+a(n-3))x+...+a1)x+a0
 */
public class Polynomial1D {

    public static void main(String[] args) {
        double[] a = {2,0,2};
        System.out.println(polynomial(a,3,2));
    }

    static double polynomial(double[] a,int n,double x){
        int i;
        double result;
        result = a[n-1];
        for (i =n-2;i>=0;i--){
            result=result*x+a[i];
        }

        return result;
    }
}
