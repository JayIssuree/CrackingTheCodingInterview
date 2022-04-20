## String Compression
### Implement a method to perform basic string compression using the counts of repeated characters
- If the compressed string is not smaller than the original string, return the original string
- You can assume the string only has uppercase and lowercase letters (a-z)

### Example:
```
"aabcccccaaa" => a2b1c5a3
"abcdefghij" => "abcdefghij"
```

### Questions:
- Can we use additional space?
- Is it case sensitive?

### Initial Thoughts / Brute Force Approach:
- Will have to touch every letter once
- Cannot use a simple hash as there could be multiple keys that are they same

### Solution:
- Use a sliding door to count how many matching characters there are from/to a certain index
- If characters match
    Incremement the to index
    Increment the character count
- Else
    Add the current character and its count to a string
    Reset the character count
    Set the from index to the to index
    Set the current character as the character at the new from index
=> O(n)
