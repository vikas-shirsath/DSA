/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        int[] arr = {0, 0, 0};
        Node temp = head;
        
        while(temp != null) {
            arr[temp.data]++;
            temp = temp.next;
        }
        
        temp = head;
        int i = 0;
        
        while(temp != null) {
            while(arr[i] == 0) {
                i += 1;
            }
            
            temp.data = i;
            temp = temp.next;
            arr[i]--;
        }
        
        return head;
        
    }
}