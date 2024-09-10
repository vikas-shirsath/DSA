class Node {
    int val;
    Node next;
    Node(int newVal) {
        this.val = newVal;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    Queue() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void enqueue(int newVal) {
        Node newNode = new Node(newVal);

        if(rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = rear.next;
        return;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return Integer.MIN_VALUE;
        }

        return front.val;
    }

    int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return Integer.MIN_VALUE;
        }

        return rear.val;
    }
}


public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        int frontVal = q.getFront();
        System.out.println(frontVal);
        int rearVal = q.getRear();
        System.out.println(rearVal);
    }
}
