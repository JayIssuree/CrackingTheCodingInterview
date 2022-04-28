## Remove Dups
### Write code to remove duplicates from an unsorted linked list
- How would you solve this problem if a temporary buffer was not allowed?

### Examples:
```
1 -> 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5 -> 5
1 -> 2 -> 3 -> 4 -> 5

```

### Questions:


### Initial Thoughts / Brute Force Approach:
- Iterate with 2 pointers
- Compare every element to every element
- Current => current node
- Runner => checks every node after it, deleting the ones that are the same as the current node
=> O(n^2)

### Solution:
- Insert each node value into a hash
- If that value is already in the hash then remove it
- Only have to go through the linked list once
=> O(n)
