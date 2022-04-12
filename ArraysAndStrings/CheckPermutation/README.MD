## Check Permutation
### Given two strings, write a method to decide if one is a permutation of the other

### Examples:
```
"ABCD", "DCAB" => true
"foo", "bar" => false
```

### Questions:
- Is the matching case sensitive? => No
- What about numbers and symbols? => Also treated as character
- What about spaces?
- Do we want to return a boolean? => Yes

### Brute Force:
- Sort both strings and compare values, they should be identical
=> O(n log n)

### Solution:
- The lengths of both strings needs to be the same
- Iterate though the first string once and map each letter to a hash table of frequencies
- For each letter:
    if the letter is not in the hash table
        create a key value pair where the key is the letter and the count is 1
    else if the letter already exists in the hash table
        + 1 to that letters value
- Iterate through the second string and for each letter:
    if the letter is in the hash table and its value is > 0
        - 1 to that letters value
        if that key value == 0, remove it from the hash (save time not having to check if all values of the hash are 0 at the end - you can just check for an empty hash)
    else if the key doesn't exist
        return false
- You only have to go through each string once
=> O(n)
- If you had to check the value of each hash element at the the end to ensure they are all 0 it would take longer
- You have to create a new data structure
=> O(n)
- Hash lookup is constant time => O(1)
