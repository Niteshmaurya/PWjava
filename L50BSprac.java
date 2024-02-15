public class L50BSprac   {
    public static void main(String[] args) {
        int arr [] = {2,3,6,7,8,10};
        int ans = BinarySearch(arr,3);
        System.out.println(ans);
    }
    static int BinarySearch(int arr[],int target){
        int n = arr.length;  
        int st =0;
        int end = n-1;
        int k =0;
        while(k <n){
            int mid = (st +end)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target >arr[mid])
        {
            st = mid +1;
        }
        else if (target <arr[mid]){
            end = mid -1;
        }
        k++;
    } 
    return -1;
}
}
