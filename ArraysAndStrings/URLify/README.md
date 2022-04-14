## URLify
### Write a method to replace all spaces in a string with '%20'
- You may assume that the string has sufficient space at the end to hold the additional characters
- You are given the 'true' length of the string
- If implementing in Java, use a character array so that you can perform the operation in place

### Example:
```
"Mr John Smith    ", 13 => "Mr%20John%20Smith"
```

### Questions:
- Can we use additional space?
- Do we want to change the original input array?

### Initial Thoughts / Brute Force Approach:
- Iterate through the string and when the value is blank, substitute in %20
=> O(n)

### Solution:
- A common approach is to start from the end of the array/string and work backwards
=> This allows us to change characters without worrying about what we are overwriting
- Will need to scan the array twice:
    - To count the number of spaces
    - To shuffle each character down and insert %20