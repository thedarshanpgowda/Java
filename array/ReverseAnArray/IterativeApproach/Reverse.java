class ReverseAnArray {
    int[] reverseAnArray(int arr[]) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;
    }
}

class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        ReverseAnArray newInstance = new ReverseAnArray();
        int[] newArr = newInstance.reverseAnArray(array);
        System.out.println("The reversed array is: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
