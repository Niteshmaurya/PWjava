import java.lang.reflect.Array;

public class L37Q4Isorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = arr.length;
        boolean ans = isSorted(arr,n);
        System.out.println(ans);
    }
    static boolean isSorted(int arr[],int n){
        if (n == 0|| n==1){
            return true;
        }
        if(arr[n-2]>arr[n-1]) return false;
        return isSorted(arr,n-1);

    }
}
