class Node {
    int val;
    Node next;
    
    Node(int newVal) {
        this.val = newVal;
        this.next = null;
    }
}

class Stack {
    Node top;

    Stack() {
        this.top = null;
    }

    boolean isEmpty() {
        return top==null;
    }

    void push(int newVal) {
        Node newNode = new Node(newVal);

        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }

        int temp = top.val;
        top = top.next;
        return temp;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }

        return top.val;
    }
}


public class Main2 {
    public static void main(String [] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        int val1 = s.peek();
        int val2 = s.pop();
        System.out.println(val1 + " " + val2);
    }
}
