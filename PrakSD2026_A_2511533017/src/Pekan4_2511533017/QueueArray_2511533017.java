package Pekan4_2511533017;

public class QueueArray_2511533017 {
    int front_3017, rear_3017, size_3017;
    int capacity_3017;
    int array_3017[];

    public QueueArray_2511533017(int capacity_3017) {
        this.capacity_3017 = capacity_3017;
        front_3017 = this.size_3017 = 0;
        this.rear_3017 = capacity_3017 - 1;
        this.array_3017 = new int[this.capacity_3017];
    }
    
    boolean isFull(QueueArray_2511533017 queue) {
        return (this.size_3017 == this.capacity_3017);
    }

    boolean isEmpty(QueueArray_2511533017 queue) {
        return (this.size_3017 == 0);
    }

    void enqueue_3017(int item) {
        if (isFull(this)) 
            System.out.println("Queue Penuh!");
            return;
    }

    int dequeue_3017() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        
        int item = this.array_3017[this.front_3017];
        this.front_3017 = (this.front_3017 + 1) % this.capacity_3017;
        this.size_3017 = this.size_3017 - 1;
        return item;
    }

    int front_3017() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array_3017[this.front_3017];
    }

    int rear_3017() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array_3017[this.rear_3017];
    }

    // mencetak element antrian
    void display() {
    	int i_3017;
        if (isEmpty(this)) {
            System.out.println("\nAntrian Kosong");
            return;
        }
        //kunjungi dari belakang dan cetak
       for (i_3017 = front_3017; i_3017 < rear_3017; i_3017++) {
         System.out.printf(" %d <-- ", array_3017[i_3017]);
    }
       return;
    }   
}