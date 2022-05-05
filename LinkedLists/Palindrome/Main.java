class Main {

    public static void main(String[] args) {
        SinglyLinkedList myLinkedList = new SinglyLinkedList(1);
        myLinkedList.append(new Node(2));
        myLinkedList.append(new Node(3));
        myLinkedList.append(new Node(50));
        myLinkedList.append(new Node(100));
        myLinkedList.append(new Node(3));
        myLinkedList.append(new Node(2));
        myLinkedList.append(new Node(1));
        System.out.println(myLinkedList.isPalindromeSolution());
    };

};
