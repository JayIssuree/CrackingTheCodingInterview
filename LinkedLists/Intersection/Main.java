class Main {

    public static void main(String[] args) {
        SinglyLinkedList myLinkedListA = new SinglyLinkedList("A");
        myLinkedListA.append(new Node("B"));
        myLinkedListA.append(new Node("C"));
        myLinkedListA.append(new Node("D"));
        SinglyLinkedList myLinkedListB = new SinglyLinkedList("E");
        myLinkedListB.append(new Node("F"));
        myLinkedListB.append(new Node("G"));
        myLinkedListB.append(new Node("H"));
        myLinkedListB.append(new Node("I"));
        myLinkedListB.append(new Node("J"));
        myLinkedListB.append(new Node("K"));
        myLinkedListB.append(new Node("L"));
        myLinkedListB.append(new Node("M"));
        Node x = new Node("X");
        myLinkedListA.append(x);
        myLinkedListB.append(x);
        System.out.println(Intersection.checkIntersection(myLinkedListA, myLinkedListB).data);
        System.out.println(Intersection.checkIntersectionSolution(myLinkedListA, myLinkedListB).data);
    };

};
