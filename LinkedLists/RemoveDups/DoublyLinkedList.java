import java.util.HashMap;

public class DoublyLinkedList {
    
    Node head;
    Node tail;

    DoublyLinkedList(int data){
        Node node = new Node(data);
        this.head = node;
        this.tail = node;
    }

    void append(Node node){
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = node;
    };

    void prepend(Node node){
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    };

    Node traverse(int data){
        Node currentNode = this.head;
        while(currentNode.data != data){
            currentNode = currentNode.next;
        };
        return currentNode;
    };

    void deleteHead(){
        Node temp = this.head.next;
        temp.prev = null;
        this.head.next = null;
        this.head = temp;
    };

    void deleteTail(){
        Node temp = this.tail.prev;
        temp.next = null;
        this.tail.prev = null;
        this.tail = temp;
    }

    void delete(Node node){
        if(node == this.head){
            deleteHead();
        } else if(node == this.tail){
            deleteTail();
        } else {
            Node leadingNode = node.next;
            Node trailingNode = node.prev;
            trailingNode.next = leadingNode;
            leadingNode.prev = trailingNode;
            node.next = null;
            node.prev = null;
        };
    };

    void insertAfter(int data, Node node){
        Node currentNode = traverse(data);
        Node leadingNode = currentNode.next;
        node.next = leadingNode;
        node.prev = currentNode;
        currentNode.next = node;
        leadingNode.prev = node;
    };

    void printLinkedList(){
        Node currentNode = this.head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        };
    };

    void removeDups(){
        HashMap<Integer, Boolean> dataFreq = new HashMap<Integer, Boolean>();
        Node currentNode = this.head;
        while(currentNode != null){
            int data = currentNode.data;
            if(dataFreq.containsKey(data)){
                Node next = currentNode.next;
                delete(currentNode);
                currentNode = next;
            } else {
                dataFreq.put(data, true);
                currentNode = currentNode.next;
            };
        };
    };

};