package sort;

/**
 * @package: sort
 * @Author: 陈淼
 * @Date: 2016/8/28
 * @Description: 算法2.2 插入排序
 *               原理：对于1到N-1之间的每一个i，将a[i]与a[0]到a[i-1]中比它小的所有元素依次有序的交换
 *               在索引i由左到右变化的过程中，它左侧的元素总是有序的，所以当i到达数组的右端时排序完成。
 */
public class Insertion {
    public static void sort(Comparable[] a) {
        //将a按升序排列
        int N = a.length;
        for (int i = 1; i < N; i++){
            //将a[i]插入到a[i-1]、a[i-2]、a[i-3]...之中
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
                exch(a, j, j-1);
            }
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
