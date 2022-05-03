## Partition
### Write code to partition a linked list around a value X
- All nodes less than X come before all nodes greater than or equal to X
- If X is contained within the list, the values of X only need to be after the elements less than X
- The partition element X can appear anywhere in the 'right partition'
    - It does not have to appear between the left and right partitions

### Examples:
```
3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1
INPUT: 5
=> 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8

3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1
INPUT: 4
=> 3 -> 1 -> 2 -> 5 -> 8 -> 5 -> 10
```

### Questions:
- Is extra space available?

### Initial Thoughts / Brute Force Approach:
- Create 2 linked lists (A, B)
- A: < X
- B: >= X
- Join the 2 linked lists together
- Join the tail of A to the head of B
- Requires O(n) additional space
=> O(n) Time

### Solution:
- Shuffle nodes within the existing linked list
- Does not use additional space
- Go through the list and preppend less than X values to the head
- You only have to go through the list once
- If you append to the tail, you will have to check that element again (wastes time)
=> O(n)