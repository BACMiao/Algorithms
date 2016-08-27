package basis;

/**
 * @package: basis
 * @Author: 陈淼
 * @Date: 2016/8/27
 * @Description: 算法1.3 先进先出队列
 */
public class Queue<Item> {
    private class Node{
        Item item;
        Node next;
    }
    private Node first;  //指向最早添加的结点的链接
    private Node last;   //指向最近添加的结点的链接
    private int N;       //队列中元素的个数
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()){
            first = last;
        } else {
            oldlast.next = last;
        }
        N++;
    }
    public Item dequeue(){
        Node oldfirst = first;
        Item item = first.item;
        first = first.next;
        oldfirst.next = null;
        if (isEmpty()){
            last = null;
        }
        N--;
        return item;
    }
}
