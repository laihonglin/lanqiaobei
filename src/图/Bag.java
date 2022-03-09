package 图;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private Node first; // 链表的首结点

    private class Node {
        Item item;
        Node next;
    }

    // 头插法
    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
