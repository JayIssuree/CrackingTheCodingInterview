## Intersection
### Given 2 (singly) linked lists, determine if the two lists intersect
- Return the intersecting node
- The intersection is defined based on reference, not value
- The Kth node of the first linked list is the exact same node (by reference) as the Jth node of the second linked list => Intersecting

### Examples:
```
A -> B -> C - \
                X -> Y -> Z
G -> H -> I - /
=> X
```

### Questions:
- Are the linked lists given the same length?
- Could the linked lists be cyclic?

### Initial Thoughts / Brute Force Approach:
- Push each node to a hash and see which one appears twice

### Solution:
- If the linked lists were the same length then they would intersect at the same position
- Run through each linked list to get the lengths and tails
    - If they intersect, the tails should be the same
- Advance the pointer on the longer linked list by the difference in lengths
- Advance both pointers until they reference the same node