package array.Kth_MaxMinElement.UsingSorting;

import java.util.Arrays;
import java.util.Scanner;

class Result {
    int kthMin, kthMax;

    Result(int kthMin, int kthMax) {
        this.kthMin = kthMin;
        this.kthMax = kthMax;
    }
}

class InnerClass {

    Result findKthElement(int arr[], int k) {
        Arrays.sort(arr);
        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];
        return new Result(kthMin, kthMax);
    }
}

class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] arr = { 89, 60, 64, 18, 20, 19, 20 };
            InnerClass innerInstance = new InnerClass();

            System.out.println("Enter the k-th element position you want to find min or max element : ");
            int k = scanner.nextInt();

            if (k <= 0 || k > arr.length) {
                throw new IllegalArgumentException("k should be between 1 and " + arr.length);
            }

            Result result = innerInstance.findKthElement(arr, k);
            System.out.println(
                    "The " + k + "-th smallest element is " + result.kthMin + " and the " + k
                            + "-th largest element is " + result.kthMax);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
