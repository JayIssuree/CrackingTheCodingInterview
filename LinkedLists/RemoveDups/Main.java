class Main {

    public static void main(String[] args) {
        DoublyLinkedList myLinkedList = new DoublyLinkedList(1);
        myLinkedList.append(new Node(2));
        myLinkedList.append(new Node(3));
        myLinkedList.append(new Node(4));
        myLinkedList.append(new Node(5));
        myLinkedList.append(new Node(6));
        myLinkedList.append(new Node(7));
        myLinkedList.append(new Node(8));
        myLinkedList.append(new Node(9));
        myLinkedList.append(new Node(10));
        myLinkedList.append(new Node(2));
        myLinkedList.append(new Node(3));
        myLinkedList.append(new Node(4));
        myLinkedList.append(new Node(5));
        myLinkedList.append(new Node(6));
        myLinkedList.append(new Node(7));
        myLinkedList.append(new Node(8));
        myLinkedList.append(new Node(9));
        myLinkedList.append(new Node(10));
        myLinkedList.removeDups();
        myLinkedList.printLinkedList();
    };

};
