public class L50Q1minElem {
    public static void main(String[] args) {
        // int arr[] = {10,11,12,1,2,3,4,5,6,7,8,9};
        int arr[] = {5,6,7,8,9,10,1,2,3,4};   
        // int arr[] = {3,4,5,1,2};
        System.out.println(minElem(arr));
    }
    static int minElem(int a[]){
        int st =0;
        int n = a.length - 1;
        int mid =0;
        int end = n -1;
        int ans = -1;
        while (st<=end) {
            mid =st + (end - st)/2;
            if(a[mid]<=a[n-1]){
                ans = mid; 
                end = mid -1;
            }
            else if (a[mid]>a[n-1])
            st = mid +1;
        }
        return ans;
    }
}
