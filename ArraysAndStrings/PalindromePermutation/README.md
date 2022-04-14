## Palindrom Permutation
### Given a string, write a function to check if it is a permutation of a palindome
- A palindome is a word that is the same forwards and backwards
- A permutation is a rearrangement of letters
- The palindrome does not need to be limited to just dictionary words

### Example:
```
"tact coa" => True (permutations: "taco cat", "atco cta" etc.)
```

### Questions:
- How to handle spaces?
- How to handle integers, symbols?

### Initial Thoughts / Brute Force Approach:
- Generate all permutations of the string, and check if one is a palindrome => O(n!)
- A palindrome of an even amount of letters would have an even count of each letter
- A palindrome of an odd amount of letters can have 1 letter with an odd count

### Solution:
- Iterate through the string and convert it to a hash table of letter frequencies
- if the string length is even
    Check that each letter has an even count
- if the string length is odd
    Count that there is only 1 letter with an odd count
- Uses extra space in terms of a hash table
=> O(n)