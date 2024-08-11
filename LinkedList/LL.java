public class LL {
    class Node {
        String data;
        Node next;

        Node (String data) {
            this.data = data;
            this.next = null;
        } 
    }

    private Node head;

    // public LL() {
    //     this.head = null;
    // }
    
    //add element to start of list 
    public void addFirst( String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        head.next = newNode.next;
        head = newNode;
    }

    //add element to end of list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print linked list
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("This");   
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
    }
}
