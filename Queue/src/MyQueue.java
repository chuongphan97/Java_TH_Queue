import java.util.Arrays;

public class MyQueue<E> {
    private int size=0;
    public static int DEFAULT_CAPACITY = 10;
    private E[] elements;
    public MyQueue(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void enqueue(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;

    }

    public E dequeue(){
        E temp;
        temp = elements[0];
        for (int i = 0; i < size-1 ; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return temp;
    }

    public E peek(){
        if (isEmpty()) return null;
        return elements[size-1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void printQueue(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] +"\t");
        }
    }

}
