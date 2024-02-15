public class L50KrotateK2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int  k =1;
        int ans[] = rotateK(arr, k);
        DisplayArr(ans);
        
    }
    static void DisplayArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");   
        }  
    }
    static int[] rotateK(int arr[],int k ){
        int n = arr.length;
        int ans[] = new int[n];
        // k = k %n;  
        for(int i =0;i<arr.length;i++){
            ans[(i+k)%n] = arr[i];
        }
        return ans;
    }
}
