import java.util.StringJoiner;
import java.util.Arrays;


public class MyStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private  Object[] elementData;
    private int size;
    public MyStack(){
        this.elementData = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyStack(int size){
        this.elementData = new Object[size];
        this.size = 0;
    }
    public void push(E value){
        if(size == elementData.length){
            int newSize = (elementData.length * 3)/2 + 1;
            Object[] tempData;
            tempData = Arrays.copyOf(elementData, newSize);
            elementData = tempData;
        }
        elementData[size]=value;
        size = size + 1;
    }
    public void remove(int index){
        int newSize = size - 1;
        if (newSize > index){
            System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
        }else {
            elementData[index] = null;
        }
        elementData[newSize] = null;

        size = newSize;
    }
    public void clear(){
        for (int i =0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;

    }
    public int size(){
        return size;
    }
    private Object get(int index){
        return  elementData[index];
    }


    public E peek(){
        if (size==0){
            return null;
        } else return (E) get(size - 1);
    }


    public E pop(){
        if (size==0){
            return null;
        } else {
            Object firstElement = elementData[size-1];
            elementData[size-1] = null;
            remove(size-1);
            size--;

            return (E) firstElement;
        }
    }
    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(",");

        for (Object element:elementData) {
            if(element!=null) {
                result.add(element.toString());
            }
        }

        return "{"+result+"}";
    }


}

