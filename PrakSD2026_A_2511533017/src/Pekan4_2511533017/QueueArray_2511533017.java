package Pekan4_2511533017;

public class QueueArray_2511533017 {
    int maxSize_3017;
    int[] array_3017;
    int front_3017;
    int rear_3017;
    int nItems_3017;

    public QueueArray_2511533017(int size_3017) {
        this.maxSize_3017 = size_3017;
        this.array_3017 = new int[maxSize_3017];
        this.front_3017 = 0;
        this.rear_3017 = -1;
        this.nItems_3017 = 0;
    }

    boolean isEmpty() {
        return nItems_3017 == 0;
    }

    boolean isFull() {
        return nItems_3017 == maxSize_3017;
    }

    void enqueue_3017(int value_3017) {
        if (isFull()) {
            System.out.println("Queue penuh");
            return;
        }

        rear_3017++;
        array_3017[rear_3017] = value_3017;
        nItems_3017++;

        System.out.println(value_3017 + " enqueued to queue");
    }

    int dequeue_3017() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int temp_3017 = array_3017[front_3017];
        front_3017++;
        nItems_3017--;

        return temp_3017;
    }

    int front_3017() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return array_3017[front_3017];
    }

    int rear_3017() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return array_3017[rear_3017];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("\nAntrian Kosong");
            return;
        }

        for (int i_3017 = front_3017; i_3017 <= rear_3017; i_3017++) {
            System.out.print(array_3017[i_3017] + " <-- ");
        }

        System.out.println();
    }
}