import java.util.Objects;
import java.util.StringJoiner;

public class MyLinkedList<E> {
    private int size;

    private Node<E> firstNode;
    private Node<E> lastNode;



    private Node<E> getNodeByIndex(int index){
        int counter = 0;
        Node<E> node = firstNode;

        while (node!=null){
            if(counter==index){
                return node;
            }
            counter++;
            node = node.getNextElement();
        }

        return new Node<>();
    }

    private void setNullFirstLastNodes(){
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public void add(E value){
        Node<E> node = new Node<>(lastNode, value, null);

        if(lastNode==null){
            firstNode = node;
        } else {
            lastNode.setNextElement(node);
        }

        lastNode = node;
        size=  size + 1;
    }

    public void remove(int index){

        if (size == 0){
            return;
        }

        if (size==1){
            setNullFirstLastNodes();
            return;
        }

        Node<E> node = getNodeByIndex(index);

        if(node.equals(firstNode)){
            node.getNextElement().setPrevElement(null);
            firstNode = node.getNextElement();
        } else {
            node.getPrevElement().setNextElement(node.getNextElement());
        }

        if (node.getNextElement()==null){
            lastNode = node.getPrevElement();
        }

        size--;

    }

    public void clear(){
        if (size==0){
            return;
        }

        Node<E> node = firstNode;
        while (node!=null){
            node.setElement(null);
            node.setPrevElement(null);
            node = node.getNextElement();
        }
        setNullFirstLastNodes();
    }

    public int size(){
        return this.size;
    }

    public E get(int index){
        Objects.checkIndex(index, size);
        Node<E> node = getNodeByIndex(index);
        return node.getElement();
    }

    @Override
    public String toString() {
        if (size==0){
            return "{}";
        }

        StringJoiner res = new StringJoiner(",");
        res.add(firstNode.toString());
        Node<E> node = firstNode.getNextElement();
        while (node!=null){
            res.add(node.toString());
            node =  node.getNextElement();
        }

        return "{"+res.toString()+"}";
    }


    private static class Node<E> {
        private E element;
        private MyLinkedList.Node<E> nextElement;
        private MyLinkedList.Node<E> prevElement;

        Node(){

        }

        Node(MyLinkedList.Node<E> prevElement, E element, MyLinkedList.Node<E> nextElement) {
            this.element = element;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }

        @Override
        public String toString() {
            return element.toString();
        }


    }

}
