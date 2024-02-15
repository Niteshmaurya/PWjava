public class L50Q1P1 {
    public static void main(String[] args) {
        int arr[] = {10,11,12,1,2,3,4,5,6,7,8,9};
        int arr2[] = {4,5,1,2,3};
        int arr3[] = {0,0,0,1,1,1,2,0,0,0};   // works also on duplicate elements
        int ans  = pivotElement(arr3);   
        System.out.println("pivot index is "+ans);
        System.out.println("pivot elem is "+arr3[ans]);  
    }
    static int pivotElement(int a[]){
        int st =0;
        int n = a.length;
        int end = n-1;
        int ans = 0;
        int mid =0;
        while (st<=end) {
            mid =st + (end - st)/2;
            if(a[mid]<=a[n-1]){
                ans = mid;
                end = mid -1;
            }
            else if(a[mid]>a[n-1])
            st = mid +1;
            
        }
        return ans;
    }
}
