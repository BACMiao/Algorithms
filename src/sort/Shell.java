package sort;

/**
 * @package: sort
 * @Author: 陈淼
 * @Date: 2016/8/30
 * @Description: 算法2.3 希尔排序
 *               原理：希尔排序的思想是使数组中任意间隔为h的元素都是有序的。这样的数组被称为h有序数组。
 *               一个h有序数组就是h个互相独立的有序数组编织在一起组成的一个数组。
 */
public class Shell {
    public static void sort(Comparable[] a) {
        //将a按升序排列
        int N = a.length;
        int h = 1;
        while (h < N/3){
            h = 3*h + 1;
        }
        while (h >= 1){
            //将数组变为h有序
            for (int i = h; i < N; i++){
                //将a[i]插入到a[i-h],a[i-2*h],a[i-2*h]...之中
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h){
                    exch(a, j, j-h);
                }
            }
            h = h/3;
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
