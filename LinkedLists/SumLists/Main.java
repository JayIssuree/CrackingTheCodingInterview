class Main {

    public static void main(String[] args) {
        SinglyLinkedList myLinkedListA = new SinglyLinkedList(7);
        myLinkedListA.append(new Node(1));
        myLinkedListA.append(new Node(6));
        SinglyLinkedList myLinkedListB = new SinglyLinkedList(5);
        myLinkedListB.append(new Node(9));
        myLinkedListB.append(new Node(2));
        SumLists sumLists = new SumLists(myLinkedListA, myLinkedListB);
        sumLists.forwarded().printLinkedList();
    };

};
