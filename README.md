## Approach to Solving Coding Problems

### Step 1 - Listen to the Problem:
- Make sure you listen carefully to the question
- Ask questions about anything you are uncertain about
- Most likely the information is there for a reason and give an indication of the approach to use:
    - "Given an array that is SORTED" => Binary Search Tree
    - "Design an algorithm to rup REPEATEDLY" => Recursion & Dynamic Programming (Cache)

### Step 2 - Come up with an Easy Example:
- Come up with a set of data for the problem
- Ask for details about the:
    - Inputs
    - Outputs
    - Assumptions
=> Can we assume the input array will contain no null values and only the correct data type?
=> What data type do we want to return? Boolean, String, Array, Integer etc.

### Step 3 - State a Naive/Brute Force Solution:
- Explain the:
    - Time Complexity
    - Space Complexity
    - Why it is not efficient
    - How we can do better

### Step 4 - Optimise & Solve:

#### Look for BUD:
- Bottlenecks:
    - Say there is a 2 step algorithm:
        - Step A takes O(n) time
        - Step B takes O(log n) time
        - Total runtime is O(n log n)
    - O(n) is the bottleneck, taking up most of the time
    => Work on this section to see if there is a faster solution
- Unecessary Work
- Duplicated Work

#### DIY (Do It Yourself):
- Think of a real world example or go through a solution manually
    => Finding a name in the phonebook you would intuitively start in the middle and either search left or right accordingly, not go through every single name

#### Simplify & Generalise:
- Simplify or tweak some constraint such as the data type
- Solve this simplified version
- Try to adapt this to fit the more complex version
```
A ransom note can be formed by cutting WORDS out of a MAGAZINE to form a new SENTENCE.
How would you figure out if a ransom note (string) can be formed from a give magazine (string)?
```
=> A simplified version would be cutting CHARACTERS out of a magazine to form a sentence
    - Hashing the letter: frequency in the magazine and the ransom note
    - Adapt this solution to whole WORDS instead of LETTERS

#### Base Case & Build:
- Most likely used in RECURSIVE algorithms
- Work from the simplest case and work up
```
Print all permutatoins of a string:
"ABC"
```
Base Case - "A" => ["A"]

Next Case - "AB" => ["AB", "BA"]

Next Case - "ABC" => ["CAB", "ACB", "ABC", "CBA", "BCA", "BAC"]

Insert the new letter into all location of all words in the previous case:
    "C" in the START, MIDDLE and END postion of "AB" and "AC"

#### Data Strucure Brainstorm:
- Go through a list of data structures and how they apply to the current problem:
    - Linked List
    - Array
    - Hash Map
    - Binary Tree
    - Heap
    - Tree
    - Graph
    - Matrix
    - Stacks
    - Queues

#### Step 5 - Walkthrough:
- Walk through the code and test it will work with an example
- Maybe write it in pseudocode
- Make sure each part of the code makes sense
- Make note of edge cases and error checks
- Explain pseudocode
    - Refer and explain other classes/functions that could do simple jobs but do not have enough time to implement
- Ensure good variable names
- Talk about potential edge cases and improvement
