class Result{
    int max, min;
    Result(int max, int min){
        this.max = max;
        this.min = min;
    }
    Result(int element){
        this.max = this.min = element;
    }
}

class FindMaxMinElements{
    Result findMaxMinElements(int arr[], int low, int high){
        //for single element
        if(low == high){
            return new Result(arr[low]);
        }
        
        //for two elements
        if(high == low + 1){
            return arr[high] > arr[low] ? new Result(arr[high], arr[low]) : new Result(arr[low], arr[high]);
        }

        //for more than two elements
        else{
            int mid = (low + high) / 2;
            Result leftArray = findMaxMinElements(arr, low, mid);
            Result rightArray = findMaxMinElements(arr, mid+1, high);

            int maxElement = leftArray.max > rightArray.max ? leftArray.max : rightArray.max;
            int minElement = leftArray.min < rightArray.min ? leftArray.min : rightArray.min;

            return new Result(maxElement, minElement);
        }
    }
}

class MainClass{
    public static void main(String args[]){
        int array[] = {100, 200, 37, 1, 0, 873};
        FindMaxMinElements newInstance = new FindMaxMinElements();
        
        Result result = newInstance.findMaxMinElements(array, 0, array.length -1);
        System.out.println("the max element in the given array is " + result.max + " and the minimum is " + result.min);
    }
}