public class L47CountSortStable {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,4,3};
        System.out.println("before sorting the array");
        DisplayArray(arr);
        
        CountSort(arr);
        System.out.println("After sorting the array");
        DisplayArray(arr);

    }
    static void DisplayArray(int arr[]){
        for(int val : arr)
        System.out.print(val+" ");
    }
    static void CountSort(int arr[]){
        int n = arr.length;
        int output[] = new int[n];
        // find the largest element 
        int max = findMax(arr);
        int count[] = new int[max +1];
        for(int i =0;i<arr.length;i++){
             count[arr[i]]++;                 // 0 0 0 2 2 1 1  
        }

        // make prefix sum array
        for(int i =0;i<n;i++){
            count[i] += count[i+1];
        }

        // find the index of each element in the original array and put it in output array 
        for(int i =n-1;i>=0;i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        // copy all elements of output in array 
        for(int i =0;i<n;i++){
            arr[i] = output[i]; 
        } 
           
    }
    static int findMax(int arr[]){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];
        }
        return max;
    }
}
