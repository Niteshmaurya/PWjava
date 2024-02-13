public class L50Q2attmpt2 {
    public static void main(String[] args) {
         int arr[] = {4,5,1,2,3};
         int t = 3;    
         int n = arr.length ;
         int l =0;
         int r = n-1;
         int p = minElem(arr);
         System.out.println("p is "+p);
         int ans =  bs(arr,t,l,p-1);
         if(ans>0)
         System.out.println(ans);
         else
         System.out.println(bs(arr,t,p,r));
    }   
    static int bs(int arr[], int t, int l, int r) {
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;  
            if (arr[mid] == t)
                return mid;
            else if (arr[mid] > t)
                r = mid - 1;
            else if (arr[mid] < t) {
                l = mid + 1;
                ans = mid; // Update ans only when arr[mid] < t
            }
        }
        return ans;
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
