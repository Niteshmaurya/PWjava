public class L49BinarySearchV2 {
    public static void main(String[] args) {
        int arr[] = {5,8,10,13,15};  

        int t = 2;
        int l = 0,r = arr.length-1;

        System.out.println(bs(arr, t, l, r));
    
    }
    static boolean bs(int arr[],int t,int l,int r){
        while (l<=r) {
            int mid = (l + r)/2;
            if(arr[mid]==t)
            return true;
            else if(arr[mid]>t)
                r = mid -1;
            else if(arr[mid]<t)
                l = mid+1;
        }
        return false;
      }
}

  