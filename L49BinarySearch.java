public class L49BinarySearch {
    public static void main(String[] args) {
        int arr[] = {5,8,10,13,15};
        int t = 13;
        int l = 0,r = arr.length-1;

        System.out.println(bs(arr, t, l, r));
    
    }
    static boolean bs(int arr[],int t,int l,int r){
        int mid = (l + r)/2;     // better way mid = l + (r - l)/2;
        if(arr[mid]==t)
        return true;
        else if(arr[mid]>t){  
            return bs(arr, t, l, mid-1);
        }
        else if(arr[mid]<t){
            return bs(arr, t, mid+1, r);
        }
        return false;
    }
}

