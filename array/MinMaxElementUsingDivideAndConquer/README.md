# Divide and Conquer to Find Maximum and Minimum Elements

This project demonstrates the use of the divide and conquer algorithm to find the maximum and minimum elements in an array. The divide and conquer approach efficiently splits the array into smaller subarrays, solves the problem for the subarrays, and then combines the results.

## How It Works

### Overview

1. **Base Cases**:
   - If the array has only one element, that element is both the maximum and minimum.
   - If the array has two elements, compare them to determine the maximum and minimum.

2. **Recursive Case**:
   - Divide the array into two halves.
   - Recursively find the maximum and minimum for both halves.
   - Combine the results to get the overall maximum and minimum.

### Why Use Divide and Conquer?

- **Efficiency**: The divide and conquer algorithm reduces the number of comparisons needed to find the maximum and minimum elements. Instead of the straightforward approach which requires `2n - 2` comparisons, the divide and conquer approach reduces the number of comparisons to approximately `3n/2`.
- **Scalability**: The algorithm performs well even for large arrays due to its logarithmic nature.

## Complexity Analysis

### Time Complexity

The divide and conquer approach involves dividing the array into two halves, recursively solving the problem for each half, and combining the results. The recurrence relation for this approach is:
\[ T(n) = 2T\left(\frac{n}{2}\right) + O(1) \]

Using the Master Theorem, we find that:
\[ T(n) = O(n) \]

This indicates that the time complexity of the algorithm is linear, \(O(n)\), where \(n\) is the size of the array.

### Space Complexity

The space complexity is determined by the recursion call stack. The depth of the recursion tree is \(O(\log n)\), where \(n\) is the size of the array. Each recursive call uses a constant amount of space, leading to a space complexity of:
\[ S(n) = O(\log n) \]

## Implementation

The implementation involves the following components:

- **Result Class**: Holds the maximum and minimum values and provides constructors to initialize these values.
- **FindMaxMinElements Class**: Contains the `findMaxMinElements` method that implements the divide and conquer algorithm.
- **MainClass**: Demonstrates the usage of the `FindMaxMinElements` class and prints the maximum and minimum values for a given array.
