public class L32Q2 {
    public static void main(String[] args) {
         int arr[] = { 12,3,4,5,6,100,8};
         int l = arr.length;
         int idx = 0;
         int ans = max(arr,idx);
         System.out.println("max is "+ans);
    }   
    static int max(int arr[],int idx){  
        // base case 
        if(idx==arr.length-1)
        return arr[idx];

        // small problem --> idx + 1, end of the array --> max --> recursion 
        int smallAns = max(arr, idx+1);
        

        // self work
        return Math.max(arr[idx], smallAns);
    }
}
