/**
 * @Author 大狼狗skr~
 * @Date 2020/2/19 11:21
 * @Version 1.0
 *
 */
public class Polynomial2D {
    public static void main(String[] args) {
        double[][] a={
                {1.0,2.0,3.0,4.0,5.0},
                {6.0,7.0,8.0,9.0,10.0},
                {11.0,12.0,13.0,14.0,15.0},
                {16.0,17.0,18.0,19.0,20.0}
        };
        System.out.println(polynomial2D(a,4,5,1,1));
    }

    static double polynomial2D(double[][] a,int m,int n,double x,double y){
        int i,j;
        double result,temp,tt;
        result = 0.0;
        tt=1.0;
        for (i=0;i<m;i++){
            temp = a[i][n-1]*tt;
            for (j=n-2;j>=0;j--){
                temp=temp*y+a[i][j]*tt;
            }
            result+=temp;
            tt*=x;
        }

        return result;
    }
}
