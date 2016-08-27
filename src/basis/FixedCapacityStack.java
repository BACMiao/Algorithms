package basis;

/**
 * @package: basis
 * @Author: 陈淼
 * @Date: 2016/8/26
 * @Description: 使用泛型的定容字符串栈
 */
public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N = 0;
    public FixedCapacityStack(int cap){
        //创建泛型数组在java中是不允许的
        a = (Item[]) new Object[cap];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        a[N++] = item;
    }
    public Item pop(){
        return a[--N];
    }

}
