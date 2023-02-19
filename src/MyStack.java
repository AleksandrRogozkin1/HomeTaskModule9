import java.util.StringJoiner;

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


    public Object peek(){
        int     len = size();

        if (len == 0) {
            return null;
        }else{
            return get(len - 1);
        }
    }


    public Object pop(){
        if (size==0){
            return null;
        } else {
            Object element = get(size-1);
            remove(size-1);
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

