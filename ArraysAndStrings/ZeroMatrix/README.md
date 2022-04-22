## Zero Matrix
### Write an algorithm such that if an element in an MxN matrix is 0, the enrite row and column are set to 0

### Example:
```
[                   [
    [1, 1, 1],          [1, 0, 1],
    [1, 0, 1], =>       [0, 0, 0],
    [1, 1, 1]           [1, 0, 1]
]                   ]
```

### Questions:
- Can we use additional space

### Initial Thoughts / Brute Force Approach:
- Do not want to run this recursively => every element would be set to 0

### Solution:
- Go through every element and flag each 0 coordinate
- Save these coordinates to 2 arrays
    - rows []
    - columns []
    - Check for duplicates to save time
- Looping through every entry of the entire matrix again to see if the row/column matches would take too much time => O(mn^2)

- Only have to iterate through the rows and columns arrays
- write 2 methods:
    replaceRow(index)
    replaceColumn(index)
