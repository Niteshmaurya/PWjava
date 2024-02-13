public class L49Q1 {
    public static void main(String[] args) {
        int arr[] = {2,2,2,3,3,3,4,5,6};  
        int t =2;
        int l = 0;
        int r = arr.length-1;
        System.out.println(firstOccurrence(arr, t, l, r));
        
    }
    static int firstOccurrence(int arr[],int t,int l,int r){
        int result = -1;
        while(l<=r){
            int mid =  (l+r)/2;
            if(arr[mid]==t){
                result = mid;
                r = mid -1;
            }
            else if(arr[mid]<t){
                l = mid + 1;
            }
            else if(arr[mid]>t){
                r = mid - 1;
            }
        }
        return result ;
        
    }
}
