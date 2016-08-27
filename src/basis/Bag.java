package basis;

import java.util.Iterator;

/**
 * @package: basis
 * @Author: 陈淼
 * @Date: 2016/8/27
 * @Description: 算法1.4 背包
 */
public class Bag<Item> implements Iterable<Item> {
    private class Node{
        Item item;
        Node next;
    }
    private Node first;
    public void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node current = first;  //记录链表的当前结点
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
