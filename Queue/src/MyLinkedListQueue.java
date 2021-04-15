import java.sql.SQLOutput;
import java.util.LinkedList;

public class MyLinkedListQueue<E> {
    public Node front;
    public Node rear;
    private int numNodes = 0;

    public MyLinkedListQueue(Object data){
        front = new Node(data);
        rear = front;
        rear.next = front;



    }

    public class Node{
        public Object data;
        public Node next;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    public void enQueue(E e){
        Node addNode = new Node(e);
        Node temp = front;
        Node holder;
        if (front == rear) {
            rear = addNode;
            temp.next = rear;
        } else {
            while (temp.next != rear){
                temp = temp.next;
            }
            holder = rear;
            temp.next = holder;
            rear = addNode;
            holder.next = rear;

        }
        numNodes++;
    }

    public E deQueue(){
        Node temp;
        temp = front;
        front = temp.next;
        rear.next = front;
        numNodes--;
        return (E) temp.data;

    }

    public void printLL(){
        Node temp = front;
        for (int j = 0; j <= numNodes; j++) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

}
