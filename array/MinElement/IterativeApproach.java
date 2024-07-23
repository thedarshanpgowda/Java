import java.util.Scanner;

class Iterate{
    int IterateFunction(int[] arr){
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}

class MainClass{
    public static void main(String[] args){
        Iterate newInstance = new Iterate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int lengthOfArray = scanner.nextInt();
        System.out.println("Enter elements in to the array");
        int []array = new int[lengthOfArray];
        for(int i = 0; i < lengthOfArray; i++){
            array[i] = scanner.nextInt();
        }
        int minElement = newInstance.IterateFunction(array);
        
        System.out.println("The min element in the given array is "+minElement);
        scanner.close();
    }
}
