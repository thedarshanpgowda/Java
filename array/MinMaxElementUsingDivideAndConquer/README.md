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

## Implementation

### Classes and Methods

- **Result Class**: 
  - Holds the maximum and minimum values.
  - Constructors to initialize these values.
  
- **FindMaxMinElements Class**:
  - Contains the `findMaxMinElements` method that implements the divide and conquer algorithm.
  
- **MainClass**:
  - Demonstrates the usage of the `FindMaxMinElements` class and prints the maximum and minimum values for a given array.
