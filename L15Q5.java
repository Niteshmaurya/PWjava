import java.util.Arrays;

public class L15Q5 {
    public static void main(String[] args) {
        int arr[] = { 5, -2, 23, 7, 87, -42, 509 };    // -42 -2 5 7 23 87 509    
        int k = 3;
        kthLargest(arr,k);
        System.out.println(kthLargest(arr, k));    
    }
    static int kthLargest(int arr[],int k){
        Arrays.sort(arr);    
        return arr[arr.length - k];

    }
}
j