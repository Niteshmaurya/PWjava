public class L32Q2self {

    public static void main(String[] args) {
        int arr[]= {23,24,45,67,4,5};
        findMax(arr,0);
    }
    static int findMax(int arr[],int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = findMax(arr, idx+1);

        return Math.max(arr[idx], smallAns);
    }
}