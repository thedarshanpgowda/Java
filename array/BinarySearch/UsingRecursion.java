import java.util.Scanner;
import java.util.Arrays;

class RecurringClass {
    int RecurringFunction(int low, int high, int key, int[] arr) {
        if (low > high) {
            return -1;
        } else {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else {
                if (arr[mid] > key) {
                    return RecurringFunction(low, mid - 1, key, arr);
                } else {
                    return RecurringFunction(mid + 1, high, key, arr);
                }
            }
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter the element to be searched:");
        int key = scanner.nextInt();

        RecurringClass rc = new RecurringClass();
        int index = rc.RecurringFunction(0, a.length - 1, key, a);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + index);
        }

        scanner.close();
    }
}
