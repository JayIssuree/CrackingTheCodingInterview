## One Away
### Write a method to check if 2 strings are 1 insertion/deletion/replaced character away from each other
- There are 3 types of edits that can be performed on strings:
    - Insert a character
    - Remove a character
    - Replace a character

### Example:
```
"pale", "ple" => true
"pales, "pale" => true
"pale", "bale" => true
"pale", "bake" => false
"pale", "pable" => true
"palel", "lapel" => false
```

### Questions:
- Can we use additional space?
- Is it case sensitive? 

### Initial Thoughts / Brute Force Approach:
- The frequencies of characters between the strings can only have a difference of 1
- Convert both strings into a hash table of character frequencies
- Iterate through one has and make sure the key/value pair matches that of the other hash
    - If it doesn't match then increment a difference counter by 1
- If the difference counter is greater than 1 return false else true
- Add checks to make sure the lengths of both strings are within 1 of each other
=> O(n)
=> This approach would not work as the position of each character is also important

### Solution:
- Check the lengths of each string - they must be within 1 of each other
- Iterate through and compare each character at index
    Then when coming to a non matching character index
    Increment the index of the longer string by one and continue to loop through
- If they are the same length
    Increment both indecies at the same time
- If the difference counter > 1 => return false
=> O(n)