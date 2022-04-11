## Notes

STRINGS == ARRAYS
=> A string is just an array of characters

### String Concatenation

In Java, STRINGS are IMMUTABLE (basically the equivalent of static arrays)
=> When concatenating a string together a new copy of the string is created and two strings are copied over, character by character

```
"Hello " + "World!"
```

A THIRD string is created with a size of 12, and each character is copied over to this
=> When a dynaic array reaches capacity and has to copy existing elements over to a new array of double the size of the original

=> Use STRING BUILDER instead (basically the equivalent of a dynamic arrays)