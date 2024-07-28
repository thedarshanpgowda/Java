## Importance of Closing the Scanner

When using a `Scanner` in Java, it is crucial to close it properly. This is important for several reasons:

### Resource Management

When you create a `Scanner`, it opens a connection to an input source (such as the console or a file). If you don't close the `Scanner`, the connection remains open, tying up system resources. This can lead to resource exhaustion and impact the performance of your application.

### Preventing Memory Leaks

Java's garbage collector automatically frees memory that's no longer being used. However, if a `Scanner` is not closed explicitly, the garbage collector may not recognize that it's no longer needed, leading to a memory leak. Memory leaks can cause your application to consume more memory over time, eventually leading to out-of-memory errors.




## Time and Space Complexity (while loop)

### Time Complexity
- **Best Case**: \( O(1) \) - The element is found at the first mid comparison.
- **Average Case**: \( O(\log n) \) - The search interval is halved each time.
- **Worst Case**: \( O(\log n) \) - The element is not present, and the interval is halved until the interval is empty.

### Space Complexity
- **Auxiliary Space**: \( O(1) \) - Binary search only requires a constant amount of extra space. Variables for the low, high, and mid indices are used, but their space requirement does not depend on the input size.

