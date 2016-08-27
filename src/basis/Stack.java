package basis;

/**
 * @package: basis
 * @Author: 陈淼
 * @Date: 2016/8/27
 * @Description: 算法1.2 下压堆栈（链表实现）
 */
public class Stack<Item>{
    private class Node{
        Item item;
        Node next;
    }
    private Node first; //栈顶，最近添加的元素
    private int N;  //元素数量
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
