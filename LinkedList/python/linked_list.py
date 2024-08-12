# creating linked list

class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
        
class Linked_list:
    def __init__(self):
        self.head = None

#print linked list        
    def print_list(self):
        current_node = self.head
        if current_node == None :
            print("List is Empty")
            return
        # else:
        while(current_node != None):
            print(current_node.data, " --> ", end=(" "))
            current_node = current_node.next
        print("None")
                
#insert element at start of linked list
    def insert_start(self,data):
        new_node = Node(data)
        if self.head == None:
            self.head = new_node
            return
        
        new_node.next = self.head
        self.head = new_node
        
#insert element at end of list
    def insert_end(self,data):
        new_node = Node(data)
        if self.head == None :
            self.head = new_node
            return
        
        current_node = self.head
        while(current_node.next != None):
            current_node = current_node.next
            
        current_node.next  = new_node
        
        
#Add node at any index
#indexing start from 0
    def insert_index(self,data,index):
        if index == 0 :
            self.insert_start(data)
            return
            
        new_node = Node(data)
        current_node = self.head
        position = 0;
        while(current_node != None and position +1 != index) :
            position += 1
            current_node = current_node.next
            
        if position == index-1 :
            new_node.next = current_node.next
            current_node.next = new_node
        else:
            print("Index is not present")
            
    
    
list = Linked_list()
list.print_list()
list.insert_start("This")
list.print_list()
list.insert_end("is")
list.print_list()
list.insert_index("list",2)
list.print_list()
list.insert_index("Not", 25)