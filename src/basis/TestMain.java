package basis;

import java.util.Scanner;

/**
 * @package: basis
 * @Author: 陈淼
 * @Date: 2016/8/27
 * @Description: 测试用例
 */
public class TestMain {
    public static void main(String[] args) {
        Queue<String> s;
        s = new Queue<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String item = sc.next();
            if (!item.equals("-")){
                s.enqueue(item);
            }else if(!s.isEmpty()){
                System.out.println(s.dequeue() + " ");
            }
        }
        System.out.println("(" + s.size() + " left on stack)");
    }
}
