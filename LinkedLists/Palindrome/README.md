## Palindrome
### Implement a function to check if a linked list is a palindrome

### Examples:
```
A -> B -> C - > D -> C -> B -> A
=> true

A -> B -> C - > D -> E -> C -> B -> A
=> false
```

### Questions:
- Is it a singly linked list?
- Is the length known?

### Initial Thoughts / Brute Force Approach:
- Will have to go through the linked list twice if the length is unknown
- Reverse linked list and check against input
- Translate to array and check back to front
- Add each element to a stack and check against linked list while popping off
- Recursively

### Solution:
- Iterate through the linked list using a fast and slow pointer
    - Pushing each element to a stack
- When the fast pointer reaches the end, the slow pointer will be in the middle of the linked list
- The stack will have all elements from the first half of the linked list, ready to be popped off in reverse order
- Iterate through the second half of the linked list comparing each node to that popped off the stack
- This uses half the space and time than if every node of the linked list was added to a stack and compared
=> O(n)