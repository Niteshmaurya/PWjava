import java.util.Arrays;

public class L42slectionSortt2 {
    public static void main(String[] args) {
        int arr[]= {5,3,2,1,4};
        int n = arr.length;
        insertionSort(arr,n);
    }
    static void insertionSort(int arr[],int n){
        int ans[] = new int[n];
        int j =0;
        // while (j<n) {
            int min = getmin(arr,n);
            // int index = Arrays.asList(arr).indexOf(min);
            // System.out.println("index is "+index);
            System.out.println("here min is "+min);
            for(int i =0;i<n;i++){
                System.out.println(arr[i]);
            }
            
        // }
        
    }
    static int getmin(int arr[],int n){
        int min = arr[0];
        int str = 0;
        for(int i =0;i<n;i++){
        if(min>arr[i]){ 
            min = arr[i];
        }
    }
    int index = Arrays.asList(arr).indexOf(min);  
    System.out.println("index is "+index);

    return min; 
    }
}
