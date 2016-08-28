package sort;

/**
 * @package: sort
 * @Author: 陈淼
 * @Date: 2016/8/28
 * @Description: 算法2.1 选择排序
 *               原理：找到数组中最小（最大）的那个元素，然后将它与第一个元素交换位置（如果第一个元素就是最小
 *               元素，那么它就和自己交换）。以此类推。。。
 */
public class Selection {
    public static void sort(Comparable[] a) {
        //将a按升序排列
        int N = a.length;
        for (int i = 0; i < N; i++){
            //将a[i]和a[i+1..N]中最小的元素交换
            int min = i;  //最小元素的索引
            for (int j = i+1; j < N; j++){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    private static  void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static boolean isSorted(Comparable[] a){
        //测试数组元素是否有序
        for (int i = 0; i < a.length; i++){
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }
}
