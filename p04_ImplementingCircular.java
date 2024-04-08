public class CircularQueue1 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue1(int k) {
        capacity = k;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if (isEmpty())
            front = 0;
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedValue = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return removedValue;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularQueue1 queue = new CircularQueue1(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Front element: " + queue.front());
        System.out.println("Rear element: " + queue.rear());

        System.out.println("Dequeuing: " + queue.dequeue());
        System.out.println("Dequeuing: " + queue.dequeue());

        System.out.println("Front element: " + queue.front());
        System.out.println("Rear element: " + queue.rear());

        queue.enqueue(6);
        queue.enqueue(7);

        System.out.println("Front element: " + queue.front());
        System.out.println("Rear element: " + queue.rear());
    }
}
