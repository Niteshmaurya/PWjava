public class L32Q1m2 {
    public static void main(String[] args) {
        int arr[]= { 1,2,3,4,5,6};
        int idx = 0;
        printArr(arr,idx);

    }
    static void printArr(int arr[],int idx){
        int l = arr.length;
        if(idx == l){
            return;
        }
        else{
            System.out.println(arr[idx]);
            printArr(arr, idx+1);  
        }
    }
}
