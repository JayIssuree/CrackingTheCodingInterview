## Is Unique
### Implement an algorithm to determine if a string has all unique characters
- What if you cannot use additional data structures?

### Examples:
```
"ABCD" => true
"Acdkampo" => false
```

### Questions:
- Is the matching case sensitive? => No
- What about numbers and symbols? => Also treated as character
- Do we want to return a boolean? => Yes
- Do we want to return which specific characters are unique? => No

### Initial Thoughts / Brute Force Approach:
- Nested loop => iterate over the string and compare each letter to every letter after it
    - Break out of the loop once the condition is met
    - This uses no additional data structures
=> O(n^2)
- Sorting => rearange the string and sort alphabetically
    - Compare the characters of the indecies next to each other

### Solution:
- Iterate though the string once and map each letter to a hash table of frequencies
- For each letter:
    if the letter is not in the hash table
        create a key value pair where the key is the letter and the count is 1
    else if the letter already exists in the hash table (and the count is 1)
        the string is not unique => break out and return false
- You only have to go through the string once
=> O(n)
- You do have to create a new data structure
=> O(n)
- Hash lookup is constant time => O(1)