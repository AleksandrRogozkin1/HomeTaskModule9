

import java.util.Objects;
import java.util.StringJoiner;
public class MyLinkedList <E> {
    private int size = 0;
    private Node<E> firstNode;
    private Node<E> lastNode;
    private static class Node<E>{
        private E item;
        private MyLinkedList.Node<E> next;
        private MyLinkedList.Node<E> prev;
        Node(){

        }
        Node(MyLinkedList.Node<E> prevElement, E element, MyLinkedList.Node<E> nextElement) {
            this.item = element;
            this.next = nextElement;
            this.prev = prevElement;
        }


        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +"item=" + item +'}';
        }
    }
    public void addLast(E value) {
        Node<E> node = new Node<>(lastNode, value, null);

        if(lastNode==null){
            firstNode = node;
        } else {
            lastNode.setNext(node);
        }

        lastNode = node;
        size=  size + 1;

    }
    public void clear(){
        if (size==0){
            return;
        }

        Node<E> node = firstNode;
        while (node!=null){
            node.setItem(null);
            node.setPrev(null);
            node = node.getNext();
        }
        firstNode = lastNode = null;
        size = 0;
    }

}
