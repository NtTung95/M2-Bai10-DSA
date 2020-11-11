import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element){
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Error");
        } else {
            size++;
            for(int i = size; i > index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
        }
    }

    public int size(){
        return this.size;
    }

    public void remove(int index) {
        if(index < 0 || index > elements.length){
            throw new IndexOutOfBoundsException("Error");
        } else
            for(int i = index; i < elements.length-1; i++){
                elements[i] = elements[i+1];
            }
            size--;
    }

//    public E clone(){
//        return (E) elements;
//    }

    public boolean contains(E o){
        boolean checkElements = true;
        for(int i = 0; i < size; i++){
            if (elements[i] == o){
                checkElements = true;
            }else
                checkElements = false;
        }
        return checkElements;
    }

    public int indexOf(E o) {
        int index = 0;
        for(int i = 0; i < size; i++){
            if (elements[i] == o){
                index = i;
            }
        }
        return index;
    }

    public boolean add(E e) {
        size++;
        elements[size-1] = e;
        return true;
    }

    private void ensureCapacity(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i>=size || i<0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[i];
    }

    public void clear(){
        size = 0;
    }
    public void display(){
        for (int i = 0; i < size; i++){
            System.out.println(elements[i]);
        }
    }
}
