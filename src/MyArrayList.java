import java.util.Arrays;
import java.util.Objects;
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

    public Object get(int index){
        Objects Objets;
        Objects.checkIndex(index, size);
        return  elementData[index];
    }

    @Override
    public String toString() {
        StringJoiner res = new StringJoiner(",");

        for (Object element:elementData) {
            if(element!=null) {
                res.add(element.toString());
            }
        }

        return "{"+res+"}";
    }
}
