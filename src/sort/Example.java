package sort;

import java.util.Scanner;

/**
 * @package: sort
 * @Author: 陈淼
 * @Date: 2016/8/28
 * @Description: 排序算法类的测试用例
 */
public class Example {
    public static void main(String[] args) {
        Selection selection = new Selection();
        String[] a = new String[10];
        for (int i = 0; i < 10; i++){
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextLine();
        }
        selection.show(a);
        Selection.sort(a);
        assert  selection.isSorted(a);
        selection.show(a);
    }
}
