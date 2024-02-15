public class L51Q4 {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,3,4,5,6,2,1};
        System.out.println(findPeak(arr));
        System.out.println("and the elem is "+arr[findPeak(arr)]);
    }
    static int findPeak(int a[]){
        int n = a.length;
        int st =0;
        int end = n -1;
        int ans =-1;
        while (st<=end) {
            int mid = st + (end -st )/2;
            if((mid == 0 ||a[mid-1]<a[mid])&& (mid == n-1 ||a[mid]<a[mid])){
                return mid;
            }
            else if (a[mid]<a[mid+1]){
                st = mid +1;
                ans = mid +1;
            }
            else if(a[mid]>a[mid+1])
            end = mid -1;
        }
        return ans;
    }
}
