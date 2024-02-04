public class L42selectionSortPW {
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        int n = arr.length;
        insertionSort(arr,n);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void insertionSort(int arr[],int n){

        int i,min_index =0;
        for( i =0;i<n-1;i++){
             min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index])
                min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i] = temp;
        }  
        //swap current element and min element --> current element i will have correct
        // arr[min_index], arr[i] 
    }
}
