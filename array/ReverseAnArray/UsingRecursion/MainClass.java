package array.ReverseAnArray.UsingRecursion;

class InnerClass {
    void usingRecursion(int[] arr, int low, int high) {
        if (low > high)
            return;

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        usingRecursion(arr, low + 1, high - 1);
    }
}

public class MainClass {
    static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 6, 7 };
        InnerClass newInstance = new InnerClass();

        newInstance.usingRecursion(arr, 0, arr.length - 1);
        System.out.println("the reversed array is");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
