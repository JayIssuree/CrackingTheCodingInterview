class Main {

    public static void main(String[] args) {
        SinglyLinkedList myLinkedList = new SinglyLinkedList(1);
        myLinkedList.append(new Node(2));
        myLinkedList.append(new Node(3));
        myLinkedList.append(new Node(4));
        myLinkedList.append(new Node(5));
        myLinkedList.append(new Node(6));
        myLinkedList.append(new Node(7));
        myLinkedList.append(new Node(8));
        myLinkedList.append(new Node(9));
        myLinkedList.append(new Node(10));
        myLinkedList.append(new Node(11));
        myLinkedList.append(new Node(12));
        myLinkedList.append(new Node(13));
        myLinkedList.append(new Node(14));
        myLinkedList.append(new Node(15));
        myLinkedList.append(new Node(16));
        myLinkedList.append(new Node(17));
        myLinkedList.append(new Node(18));
        myLinkedList.append(new Node(19));
        myLinkedList.append(new Node(20));
        System.out.println(myLinkedList.kthFromLast(5).data);
    };

};
