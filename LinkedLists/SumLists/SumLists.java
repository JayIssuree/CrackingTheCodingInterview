class SumLists{

    int totalReversed;
    int totalForwarded;

    SumLists(SinglyLinkedList listA, SinglyLinkedList listB){
        totalReversed = calculateSumReversed(listA) + calculateSumReversed(listB);
        totalForwarded = calculateSumForwarded(listA) + calculateSumForwarded(listB);
    };

    int calculateSumReversed(SinglyLinkedList linkedList){
        int sum = 0;
        int columnValue = 1;
        Node currentNode = linkedList.head;
        while(currentNode != null){
            sum += currentNode.data * columnValue;
            columnValue *= 10;
            currentNode = currentNode.next;
        };
        return sum;
    };

    int calculateSumForwarded(SinglyLinkedList linkedList){
        int sum = 0;
        int powerOf = linkedList.length - 1;
        Node currentNode = linkedList.head;
        while(currentNode != null){
            sum += currentNode.data * (int)Math.pow(10, powerOf);
            powerOf--;
            currentNode = currentNode.next;
        };
        return sum;
    };

    SinglyLinkedList reversed(){
        String totalReversed = Integer.toString(this.totalReversed);
        SinglyLinkedList reversedLL = new SinglyLinkedList(Character.getNumericValue(totalReversed.charAt(0)));
        for(int i = 1; i < totalReversed.length(); i++){
            reversedLL.append(new Node(Character.getNumericValue(totalReversed.charAt(i))));
        };
        return reversedLL;
    };

    SinglyLinkedList forwarded(){
        String totalForwarded = Integer.toString(this.totalForwarded);
        SinglyLinkedList forwardedLL = new SinglyLinkedList(Character.getNumericValue(totalForwarded.charAt(0)));
        for(int i = 1; i < totalForwarded.length(); i++){
            forwardedLL.append(new Node(Character.getNumericValue(totalForwarded.charAt(i))));
        };
        return forwardedLL;
    };

};