public class L51Q3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,3,1};
        int ans = PeakOfMountainArray(arr);
        System.out.println("index of peak element is "+ans);
        System.out.println("and the peak element is "+arr[ans]);
    }
    static int PeakOfMountainArray(int arr[]){
        int st =0;
        int end = arr.length -1;
        int ans =0;  
        while(st<=end){
        int mid = st + (end -st)/2;
        if(arr[mid]<arr[mid+1])
        {
            ans = mid +1;
            st = mid +1;
        }
        else if (arr[mid]>arr[mid+1])
        end = mid -1;
    }
        return ans;
    }
}
