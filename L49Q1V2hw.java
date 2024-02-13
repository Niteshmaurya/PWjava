public class L49Q1V2hw {
    public static void main(String[] args) {
        int arr[] = {2,2,2,3,3,3,4,5,6};  
        int t =3;
        int l = 0;
        int r = arr.length-1;
        System.out.println(lastOccurrence(arr, t, l, r));
        
    }
    static int lastOccurrence(int arr[],int t,int l,int r){
        int result = -1;
        while(l<=r){
            int mid =  (l+r)/2;
            if(arr[mid]==t){
                result = mid;
                l = mid +1;
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
