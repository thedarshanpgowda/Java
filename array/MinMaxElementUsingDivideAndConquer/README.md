# Divide and Conquer to Find Maximum and Minimum Elements

This project demonstrates the use of the divide and conquer algorithm to find the maximum and minimum elements in an array. The divide and conquer approach efficiently splits the array into smaller subarrays, solves the problem for the subarrays, and then combines the results.

## How It Works

### Overview

1. **Base Cases**:
   - If the array has only one element, that element is both the maximum and minimum.
   - If the array has two elements, compare them to determine the maximum and minimum.

2. **Recursive Case**:
   - Divide the array into two halves.
   - Recursively find the maximum and minimum for each half.
   - Combine the results to get the overall maximum and minimum.

### Why Use Divide and Conquer?

- **Efficiency**: This approach reduces the number of comparisons needed to find the maximum and minimum elements. Instead of the straightforward approach which requires comparing each element in pairs, this method reduces the number of comparisons required.
- **Scalability**: The algorithm handles large arrays efficiently due to its logarithmic nature.

## Complexity Analysis

### Time Complexity

The time complexity of the divide and conquer approach is linear. This means that the algorithm performs a number of operations proportional to the size of the array. Specifically, it examines each element in the array once, making it efficient with a time complexity of \(O(n)\), where \(n\) is the number of elements in the array.

### Space Complexity

The space complexity is determined by the depth of the recursion call stack. Since the algorithm divides the array in half at each step, the depth of the recursion tree is proportional to the logarithm of the number of elements. As a result, the space complexity is \(O(\log n)\), where \(n\) is the number of elements in the array. This means the amount of memory used grows logarithmically with the size of the array.

## Implementation

The implementation involves the following components:

- **Result Class**: Holds the maximum and minimum values and provides constructors to initialize these values.
- **FindMaxMinElements Class**: Contains the `findMaxMinElements` method that implements the divide and conquer algorithm.
- **MainClass**: Demonstrates the usage of the `FindMaxMinElements` class and prints the maximum and minimum values for a given array.
