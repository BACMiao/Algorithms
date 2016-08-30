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
        Shell cm = new Shell();
        String[] a = new String[10];
        for (int i = 0; i < 10; i++){
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextLine();
        }
        cm.show(a);
        cm.sort(a);
        assert cm.isSorted(a);
        cm.show(a);
    }
}
