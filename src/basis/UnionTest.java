package basis;

import java.util.Scanner;

/**
 * @package: basis
 * @Author: 陈淼
 * @Date: 2016/8/27
 * @Description: union测试用例
 */
public class UnionTest {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        QuickFind quickfind = new QuickFind(N);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (quickfind.connected(p,q)){
                continue;
            }
            quickfind.union(p,q);
            System.out.println(p + " " + q);
        }
        System.out.println(quickfind.count() + "components");
    }
}
