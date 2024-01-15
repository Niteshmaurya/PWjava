public class L17Q3 {

    public static void main(String[] args) {
        int arr[] = {12,3,5,6,8};
        reversArray(arr);
    }
    static int reversArray(int arr[]){
        int n = arr.length;
        for(int i = 0 ;i<n;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];   
            arr[n-1-i]=temp;   
        }
        for(int i = 0;i<arr.length;i++){     
            System.out.println(arr[i]);
        }
        // System.out.println("dill" +arr[-1]);
        return 0;
    }
}