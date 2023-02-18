import java.util.Arrays;
import java.util.StringJoiner;

public class MyQueue <E> {
    private static final int DEFAULT_CAPACITY = 10;
    private  Object[] elementData;
    private int size;
    public MyQueue(){
        this.elementData = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyQueue(int size){
        this.elementData = new Object[size];
        this.size = 0;
    }
    public void add(E value){
        elementData[size]=value;
        size = size + 1;
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
    public Object peek(){
        if (size==0){
            return null;
        } else {
            return get(0);
        }
    }
    private void remove(int index){
        int newSize = size - 1;
        if (newSize > index){
            System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
        } else {
            elementData[index] = null;
        }
        elementData[newSize] = null;

        size = newSize;
    }
    public Object poll(){
        if (size==0){
            return null;
        } else {
            Object element  = get(0);
            remove(0);
            return element;
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
