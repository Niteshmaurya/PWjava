public class L43insertionSort{
    public static void main(String[] args) {
        int arr[] = {3,5,2,7,2,4};
        int n = arr.length;
        insertionSort(arr,n);
        for(int val : arr)
        System.out.print(val+" ");
    }
    static void insertionSort(int arr[],int n){
        for(int i =1;i<n;i++){
            int j =i;
            while (j>0 && arr[j]<arr[j-1]) { 
                // swap a[j],a[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

    }
}