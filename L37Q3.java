public class L37Q3 {
    public static void main(String[] args) {
        int arr[] = {45, 2,4,6,3,2,5,4,2};
        int t = 4;
        int n = arr.length;
        int count =0;
        int ans = getLastIndex(arr,t,n,count,1);
        System.out.println(ans);
    }
    static int getLastIndex(int arr[],int t,int n,int count,int idx){
        if(idx>=n){
            return count;
        }
        if(t == arr[idx]){
            count = idx;
        }
        
       return getLastIndex(arr, t, n,count, idx+1);
    }  
}
