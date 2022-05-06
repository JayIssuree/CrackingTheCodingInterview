import java.util.HashMap;

class Intersection {
  
    static Node checkIntersection(SinglyLinkedList listA, SinglyLinkedList listB){
        HashMap<Node, Boolean> hash = new HashMap<Node, Boolean>();
        Node listANode = listA.head;
        Node listBNode = listB.head;
        while(listANode != null || listBNode != null){
            if(listANode != null){
                if(addToHash(hash, listANode)){
                    return listANode;
                };
                listANode = listANode.next;
            };
            if(listBNode != null){
                if(addToHash(hash, listBNode)){
                    return listBNode;
                };
                listBNode = listBNode.next;
            };
        };
        return null;
    };
    
    static Boolean addToHash(HashMap<Node, Boolean> hash, Node node){
        if(!hash.containsKey(node)){
            hash.put(node, false);
            return false;
        } else {
            hash.put(node, true);
            return true;
        }
    };

    static Object[] listLength(SinglyLinkedList list){
        int length = 0;
        Node currentNode = list.head;
        while(currentNode.next != null){
            length++;
            currentNode = currentNode.next;
        };
        Object[] info = {length, currentNode};
        return info;
    };

    static Node increment(SinglyLinkedList list, int amount){
        Node currentNode = list.head;
        for(int i = 0; i < amount; i++){
            currentNode = currentNode.next;
        };
        return currentNode;
    };

    static Node checkIntersectionSolution(SinglyLinkedList listA, SinglyLinkedList listB){
        Object[] listAInfo = listLength(listA);
        Object[] listBInfo = listLength(listB);
        int listALength = Integer.parseInt((listAInfo[0]).toString());
        int listBLength = Integer.parseInt((listBInfo[0]).toString());
        Node listANode = listA.head;
        Node listBNode = listB.head;
        if(listAInfo[1] != listBInfo[1]){
            return null;
        };
        if(listALength > listBLength){
            int difference = listALength - listBLength;
            listANode = increment(listA, difference);
        };
        if(listBLength > listALength){
            int difference = listBLength - listALength;
            listBNode = increment(listB, difference);
        };
        while(listANode != listBNode){
            listANode = listANode.next;
            listBNode = listBNode.next;
        };

        return listANode;

    };

};
