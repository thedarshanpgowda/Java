Why is closing the Scanner important?
-Resource Management:
--When you create a Scanner, it opens a connection to an input source (like the console or a file). If you don't close it, the connection remains open, tying up system resources.
-Preventing Memory Leaks:
--Java's garbage collector automatically frees memory that's no longer being used. However, if a Scanner is not closed explicitly, the garbage collector may not recognize that it's no longer needed, leading to a memory leak.