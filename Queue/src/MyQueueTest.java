public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(3);
        myQueue.enqueue(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.printQueue();

        myQueue.dequeue();
        System.out.println();
        myQueue.printQueue();
    }
}
