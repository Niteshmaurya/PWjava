public class L50Q2L2 {
    public static void main(String[] args) {
        int arr[] = {9,10,11,12,1,2,3,4,5,6,7,8};
        int arr3[] = {0,0,0,1,1,1,2,0,0,0};   // works also on duplicate elements
        int t = 2;
        int ans = findIndexOfElement(arr,t);  
        System.out.printf("index of %d is %d",t,ans);

    }
    static int findIndexOfElement(int arr[],int t){
        int st =0;
        int n = arr.length;
        int end = n -1;
        int ans = -1;
        while(st<=end){
            
            int mid = st + (end-st)/2;
            if(arr[mid] == t)
            return mid;
            else if(arr[mid]<arr[end])
            {
                if(arr[mid]<t&&t<arr[end])
                st = mid +1;  
                end = mid -1;
            }
            else{           // st to mid is sorted
                if(arr[st]<t&&t<arr[mid])
                end = mid -1;
                else 
                st = mid +1;
            }
        }
        return -1;
    }
}
