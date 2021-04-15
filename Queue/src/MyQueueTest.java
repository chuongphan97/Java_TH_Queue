public class MyQueueTest {
    public static void main(String[] args) {
//        MyQueue<Integer> myQueue = new MyQueue<>();
//        myQueue.enqueue(1);
//        myQueue.enqueue(3);
//        myQueue.enqueue(5);
//        myQueue.enqueue(1);
//        myQueue.enqueue(2);
//        myQueue.printQueue();
//
//        myQueue.dequeue();
//        System.out.println();
//        myQueue.printQueue();

        MyLinkedListQueue<Integer> integerMyLinkedListQueue = new MyLinkedListQueue<>(10);


        integerMyLinkedListQueue.enQueue(20);
        integerMyLinkedListQueue.enQueue(40);
        integerMyLinkedListQueue.enQueue(20);

        integerMyLinkedListQueue.printLL();

        System.out.println();
        System.out.println(integerMyLinkedListQueue.deQueue());
        System.out.println();
        integerMyLinkedListQueue.printLL();
    }
}
