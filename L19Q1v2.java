public class L19Q1v2 {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        prefixSum(arr);
    }
    static void prefixSum(int arr[]){
        int n = arr.length;
        for(int i =1;i<n;i++){
            arr[i] = arr[i]+ arr[i-1];
        }
        for(int k =0;k<n;k++){
            System.out.print(" "+arr[k]);
        }
    }
}
