import java.util.Arrays;
import java.util.Scanner;

public class UsingWhileLoop {
    
    // Binary Search Method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid; // Target found
            }
            
            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        
        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read array size
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        // Read array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Read the target value
        System.out.println("Enter the target value to search for:");
        int target = scanner.nextInt();
        
        // Sort the array
        Arrays.sort(array);
        
        // Perform binary search
        int result = binarySearch(array, target);
        
        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        
        scanner.close();
    }
}
