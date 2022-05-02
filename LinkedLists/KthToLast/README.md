## Return Kth to Last
### Implement an algorithm to find the Kth to last element of a singly linked list

### Examples:
```
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
3
=> 7
```

### Questions:
- Is the length of the linked list known?

### Initial Thoughts / Brute Force Approach:
- A singly linked list means that the start is always at the head and can only move one way
- Instead of working backwards from the tail
- Do an entire iteration of the linked list to calculate the length
- Iterate through it again length - Kth times and return that element
=> O(2n)
=> O(n)

- Iterate through the linked list, and place each element in an array
- The position of each element is now known
- Return the array length - Kth element of the array
- Takes up more space but takes less time
=> O(n) Time
=> O(n) Space

### Solution:
- Have 2 pointers
- A: head
- B: K
- The B pointer is K nodes ahead of A
- Iterate through the list, moving each pointer along 1 node
- When B reaches the end, A would be the Kth element from the last

