## Sum Lists
### Given 2 numbers represented by a linked list, where each node contain a single digit. Write a function that adds the 2 numbers and returns the sum as a linked list
- The digits are stored in reverse order, such that the 1's digit is at the head of the list
- Return the result in both a forwarded and reversed digit linked list

### Examples:
```
INPUT:
    7 -> 1 -> 6
    5 -> 9 -> 2
=> 2 -> 1 -> 9 (reversed)

INPUT:
    6 -> 1 -> 7
    2 -> 9 -> 5
=> 9 -> 1 -> 2 (forwarded)

617 + 295 = 912
```

### Questions:
- Is is a singly or doubly linked list?
- Is it possible to work from the tail -> head?
- Are the lengths of the lists known?

### Initial Thoughts / Brute Force Approach:

### Solution:
- Reversed:
- columnValue starts at 1 and is multiplied by 10 for each node
- Each digit is multiplied by the columnValue and added to the total

-Forwarded:
- Calculate the length of the string first
- powerOf starts at length-1 and length-- for each node
- Each digit is multiplied by 10**powerOf and added to the total

- Do the this for both given linked lists
- Convert the total to a string
- Iterate through with charAt
- Convert each digit back to an integer and append to a new linked list

=> O(3n)
=> O(n)