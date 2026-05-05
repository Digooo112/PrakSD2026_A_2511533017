package Pekan4_2511533017;

public class QueueArrayDriver_2511533017 {

    public static void main(String[] args) {
        QueueArray_2511533017 queue_3017 = new QueueArray_2511533017(1000);

        queue_3017.enqueue_3017(10);
        queue_3017.enqueue_3017(20);
        queue_3017.enqueue_3017(30);
        queue_3017.enqueue_3017(40);

        System.out.println("Item di depan " + queue_3017.front_3017());
        System.out.println("Item dibelakang " + queue_3017.rear_3017());
        System.out.println("tampilan queue");

        queue_3017.display();

        System.out.println(queue_3017.dequeue_3017() + " dihapus dari queue");
        System.out.println("Item di depan " + queue_3017.front_3017());
        System.out.println("Item dibelakang " + queue_3017.rear_3017());
        System.out.println("tampilan queue setelah satu data dihapus");

        queue_3017.display();
    }
}
