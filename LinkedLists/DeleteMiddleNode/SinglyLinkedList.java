import java.util.HashMap;

public class SinglyLinkedList {
    
    Node head;
    Node tail;

    SinglyLinkedList(int data){
        Node node = new Node(data);
        this.head = node;
        this.tail = node;
    }

    void append(Node node){
        this.tail.next = node;
        this.tail = node;
    };

    void prepend(Node node){
        node.next = this.head;
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
        this.head.next = null;
        this.head = temp;
    };

    void deleteTail(){
        Node trailingNode = this.head;
        Node leadingNode = trailingNode.next;
        while(leadingNode.next != null){
            trailingNode = leadingNode;
            leadingNode = leadingNode.next;
        };
        trailingNode.next = null;
        this.tail = trailingNode;
    }

    void delete(Node node){
        if(node == this.head){
            deleteHead();
        } else if(node == this.tail){
            deleteTail();
        } else {
            Node trailingNode = this.head;
            Node leadingNode = trailingNode.next;
            while(leadingNode != node){
                trailingNode = leadingNode;
                leadingNode = leadingNode.next;
            };
            trailingNode.next = leadingNode.next;
            leadingNode.next = null;
        };
    };

    void insertAfter(Node listedNode, Node insertedNode){
        insertedNode.next = listedNode.next;
        listedNode.next = insertedNode;
    };

    void printLinkedList(){
        Node currentNode = this.head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        };
    };

    void deleteMiddleNode(Node middleNode){
        Node currentNode = middleNode;
        Node nextNode = currentNode.next;
        while(nextNode.next != null){
            currentNode.data = nextNode.data;
            currentNode = nextNode;
            nextNode = nextNode.next;
        };
        currentNode.data = nextNode.data;
        currentNode.next = null;
        this.tail = currentNode;
    };

};