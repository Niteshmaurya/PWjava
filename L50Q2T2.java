public class L50Q2T2 {
    public static void main(String[] args) {
        int arr2[] = {7,8,9,1,2,3,4,5,6};
        int p  = pivotElement(arr2);   
        System.out.println("pivot index is "+p);
        System.out.println("pivot elem is "+arr2[p]);  
        int ans = findElement(arr2, 2, p);    
        System.out.println("index of target is "+ans);
    }
    static int findElement(int arr[],int t,int p){
       int ans =  BinarySearch(arr,0,p-1,t);
    //    if(ans != -1) 
    //         return ans;
    //     else    
    //     ans = BinarySearch(arr, p, arr.length-1, t);     
       return ans;
    }  
    static int BinarySearch(int[] arr,  int st, int end, int target) {
        int mid = st + (end - st) / 2;
        int ans = -1;
        while (st <= end) {
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                st = mid + 1;
            else {
                ans = mid;
                end = mid - 1;
            }
            mid = st + (end - st) / 2;
        }
        int p =3;
        int t = target;
        if (ans == -1)
        ans = BinarySearch(arr, p, arr.length-1, t);   

        return ans;
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
