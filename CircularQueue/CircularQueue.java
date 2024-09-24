public class CircularQueue {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    class Queue {
        Node front, rear;
        int maxSize;  
        int size;     

        Queue(int maxSize) {
            this.maxSize = maxSize;
            this.size = 0;
            front = null;
            rear = null;
        }

        public void enque(int data) {
            if (size == maxSize) {
                System.out.println("Queue is full");
                return;
            }

            Node newNode = new Node(data);
            if (front == null) {
                front = newNode;
                rear = newNode;
                rear.next = front;  
            } else {
                rear.next = newNode;
                rear = newNode;
                rear.next = front;  
            }
            size++;
        }

        public int dequeue() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }

            int temp = front.data;
            if (front == rear) {  
                front = rear = null;
            } else {
                front = front.next;
                rear.next = front;  
            }
            size--;
            return temp;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            Node temp = front;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != front);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new CircularQueue().new Queue(5);  

        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        q.enque(60);
        q.display();
    }
}
