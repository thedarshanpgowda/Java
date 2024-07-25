class TwoPointerClass {
    int[] returnsAnArray(int[] array) {
        for (int left = 0, right = array.length - 1; right > left; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        return array;
    }
}

class TwoPointers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        TwoPointerClass newInstance = new TwoPointerClass();
        int[] newArray = newInstance.returnsAnArray(array);
        System.out.println("The reversed array is: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
