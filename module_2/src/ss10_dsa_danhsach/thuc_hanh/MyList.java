package ss10_dsa_danhsach.thuc_hanh;

import java.util.Arrays;

public class MyList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
    }
    public MyList(int size, Object[] element) {
        this.size = size;
        this.element = element;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }

    public Object[] getElement() {
        return element;
    }

    public void setElement(Object[] element) {
        this.element = element;
    }

    public void add(){
        
    }
    public void ensureCapa(){
        int newArr = element.length *2;
        element = Arrays.copyOf(element,newArr);
    }
    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", element=" + Arrays.toString(element) +
                '}';
    }
}
