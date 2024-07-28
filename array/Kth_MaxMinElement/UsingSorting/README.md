# K-th Smallest and Largest Element Finder

This Java program finds the k-th smallest and k-th largest elements in an array by sorting it.

## Components

1. **`Result` Class**: Holds the k-th smallest (`kthMin`) and k-th largest (`kthMax`) elements.
2. **`InnerClass` Class**: Provides the `findKthElement` method that sorts the array and retrieves the k-th smallest and largest elements.
3. **`MainClass` Class**: Manages user input and displays the results.

## Usage

1. **Compile**:
   ```bash
   javac array/Kth_MaxMinElement/UsingSorting/MainClass.java
   ```

2. **Run**:
   ```bash
   java array.Kth_MaxMinElement.UsingSorting.MainClass
   ```

3. **Input**: Enter the k-th element position (1-based index) when prompted.

**Example**:
```
Enter the k-th element position you want to find min or max element : 
3
The 3rd smallest element is 20 and the 3rd largest element is 60
```

## Complexity

- **Time Complexity**: O(n log n) due to array sorting.
- **Space Complexity**: O(1) assuming in-place sorting.
