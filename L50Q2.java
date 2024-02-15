public class L50Q2 {
    public static void main(String[] args) {
         int arr[] = {5,4,3,1,2};  
         int t = 4;   
         int n = arr.length ;
         int p = minElem(arr);
         System.out.println("p is "+p);
         int ans =  BS(arr,0,n,t);
         if(ans>0)
         System.out.println(ans);
         else
         System.out.println(BS(arr,p,n,t));
    }
    static int BS(int arr[],int l,int r,int t){
        int mid = l +(r - l)/2;
        int ans = -1;
        while (l<=r) {
            if(arr[mid] == t)
            return mid;
            else if(arr[mid]>t){
                r = mid -1;
            }
            else if(arr[mid]<t){
                l = mid + 1;  
                ans = mid;
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
