## Notes

- Lookup is not constant time, you have to iterate through the entire list => O(n)
- Inserting/Deleting to the head/tail => O(1)
- Inserting/Deleting anywhere else => O(n) due to traversal
    - You DO NOT have to SHIFT elements, unlike in an Array