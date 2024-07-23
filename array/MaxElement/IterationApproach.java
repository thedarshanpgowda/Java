import java.util.Scanner;

class Iterate{
    int IterateFunction(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
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
        int maxElement = newInstance.IterateFunction(array);
        
        System.out.println("The max element in the given array is "+maxElement);
        scanner.close();
    }
}
