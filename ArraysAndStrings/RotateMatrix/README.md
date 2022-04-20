## Rotate Matrix
### Given an image represented by an NxN matrix, write a method to rotate the image by 90 degrees
- Each pixel in the image is 4 bytes
- Can you do this in place? => Not use extra space

### Example:
```
[                   [
    [A, A, A],          [C, B, A],
    [B, B, B], =>       [C, B, A],
    [C, C, C]           [C, B, A]
]                   ]

[                       [
    [A, A, A, A],           [D, C, B, A],
    [B, B, B, B], =>        [D, C, B, A],
    [C, C, C, C], =>        [D, C, B, A],
    [D, D, D, D]            [D, C, B, A]
]                       ]
```

### Questions:

### Initial Thoughts / Brute Force Approach:
- How can we not use additional space?
- If it is done 1 index at a time, then only 1 temp value is needed
- Is it possible to do this recursively?
- Has to touch all elements

- The rotation algorithm per element:
    [A, B] => [B, B.length - A]
=> O(n^2)

### Solution:
- Perform a swap on each layer, starting from the outermost and working our way inwards