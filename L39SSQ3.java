public class L39SSQ3 {
    public static void main(String[] args) {
        int arr[] = {2,4,5};
        subSetSum(arr,3,0,0);
    }
   static void subSetSum(int[] arr, int n,int idx,int currSSsum ){
    if(idx>=n){
    System.out.println(currSSsum);
    return;
    }

    // curr idx + sum
    subSetSum(arr, n, idx+1, currSSsum + arr[idx]);   // include


    // curr ans
    subSetSum(arr, n, idx+1, currSSsum);

   }
}
