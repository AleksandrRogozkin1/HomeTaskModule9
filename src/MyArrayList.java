import java.util.Arrays;

import java.util.StringJoiner;

public class MyArrayList <E>  {
    private static final int DEFAULT_CAPACITY = 10;
    private  Object[] elementData;

    private int size;
    public MyArrayList(){
        this.elementData = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    public MyArrayList(int size){
        this.elementData = new Object[size];
        this.size = 0;
    }
    public void add(E value){
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

    public E get(int index){
        return (E) elementData[index];
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
