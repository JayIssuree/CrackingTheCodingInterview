## String Rotation
### Write a method isSubstring which checks if one word is a substring of another
- Given two strings s1 and s2
- Write code to check if s2 is a rotation of s1 only using one call to isSubstring

### Example:
```
"waterbottle", "erbottlewat" => true
"waterbottle", "botwatertle" => false
```

### Questions:
- Is it case sensitive?

### Initial Thoughts / Brute Force Approach:
- Double sliding door
- Iterate through a stringA until you find a character that matches stringB[0]
- Compare each character at each index FROM that position
    - Increment the indecies of each if the comparison is the same
    - Break out if the comparison does not match
    - Once stringA reaches the end, set the index for stringA to 0
    - If you can reach the end of stringB, return true
=> O(2n)
=> O(n)

### Solution:
- stringA + stringA contains every possible rotation
- Check to see if (stringA + stringA) contains stringB
- "waterbottlewaterbottle"
-     ^         ^
-    "erbottlewat"
=> O(2n)
=> O(n)