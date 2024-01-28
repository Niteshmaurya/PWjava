public class L38Q2revArray {
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5};
         int n = arr.length;
         revArr(arr,0);
    }
    static void revArr(int arr[],int idx){
        if(n==0)
        return;
        // recursive work
        revArr(arr, n-1);       
    }
}
