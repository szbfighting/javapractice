import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author 大狼狗skr~
 * @Date 2020/2/18 8:56
 * @Version 1.0
 */
public class ProductOfNumbersTest {
    public static void main(String[] args) {
        ProductOfNumbers p = new ProductOfNumbers();
        p.add(3);
        p.add(0);
        p.add(2);
        p.add(5);
        p.add(4);
        System.out.println(p.getProduct(2));
        System.out.println(p.getProduct(3));
        System.out.println(p.getProduct(4));
        p.add(8);
        System.out.println(p.getProduct(2));
    }

    static class ProductOfNumbers {

        List<Integer> list;
        public ProductOfNumbers() {
            list = new ArrayList<>();
            list.add(1);
        }

        public void add(int num) {
            if (num ==0 ){
                list = new ArrayList<>();
                list.add(1);
            }else{
                list.add(list.get(list.size()-1)*num);
            }
        }

        public int getProduct(int k) {
            if (k>=list.size())
                return 0;
            else
                return list.get(list.size()-1)/list.get(list.size()-k-1);
        }
    }
}
