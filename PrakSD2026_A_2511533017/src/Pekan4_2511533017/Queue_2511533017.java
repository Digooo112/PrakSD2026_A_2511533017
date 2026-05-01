package Pekan4_2511533017;

public class Queue_2511533017 {
	int front_3017, rear_3017, max_3017;
    String queue_3017[];

    public Queue_2511533017(int max_3017) {
        this.max_3017 = max_3017;
        queue_3017 = new String[max_3017];
        front_3017 = -1;
        rear_3017 = -1;
    }

    public boolean isEmpty_3017() {
        return (front_3017 == -1);
    }

    public boolean isFull_3017() {
        return (rear_3017 == max_3017 - 1);
    }

    public void enqueue_3017(String data_3017) {
        if (isFull_3017()) {
            System.out.println("Antrian penuh");
        } else {
            if (isEmpty_3017()) {
                front_3017 = 0;
            }
            rear_3017++;
            queue_3017[rear_3017] = data_3017;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    public void dequeue_3017() {
        if (isEmpty_3017()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println(queue_3017[front_3017] + " telah dilayani");
            if (front_3017 == rear_3017) {
                front_3017 = rear_3017 = -1;
            } else {
                front_3017++;
            }
        }
    }

    public void display_3017() {
        if (isEmpty_3017()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Isi antrian:");
            int no= 1;
            for (int i = front_3017; i <= rear_3017; i++) {
                System.out.println(no + ". " + queue_3017[i]);
                no++;
            }
        }
    }

    public void reverse_3017() {
        if (isEmpty_3017()) {
            System.out.println("Antrian kosong!");
        } else {
            int start = front_3017;
            int end = rear_3017;
            while (start < end) {
                String temp = queue_3017[start];
                queue_3017[start] = queue_3017[end];
                queue_3017[end] = temp;
                start++;
                end--;
            }
        }
    }
}