public class L32Q3 {
    public static void main(String[] args) {
         int arr[] = { 1,23,1};
         int ans = sum(arr,0);
         System.out.println("sum is "+ans);

    }
    static int sum(int arr[],int idx){
        if(idx==arr.length) return 0;
        if(idx == arr.length-1){
            return arr[idx];
        }
        else
        return arr[idx]+sum(arr,idx+1);
    }
}
