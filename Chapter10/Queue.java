package chapter10;

public class Queue {

    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int size) {
        elements = new int[size];

    }

    void enqueue(int v) {
        if (size >= elements.length) {

            int temp[] = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    int dequeue() {
        int deq = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return deq;
    }

    boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int getLength() {
        return elements.length;
    }
}

class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i < 21; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(queue.dequeue());
        }
    }
}
