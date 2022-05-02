## Delete Middle Node
### Implement an algorithm to delete a node in the middle of a singly linked list
- Access to the head node is not given
- Given only access to that node
- Does not have to be exactly in the middle (just between the head and tail nodes)

### Examples:
```
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
INPUT: Node 5
=> 1 -> 2 -> 3 -> 4 -> 6 -> 7 -> 8 -> 9 -> 10
```

### Questions:
- Edge cases regarding the head/tail nodes

### Initial Thoughts / Brute Force Approach:

### Solution:
- Copy data over from the next node over to the current node
- When the end of the list is reached, delete the end node
=> O(n)