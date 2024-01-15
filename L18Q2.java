public class L18Q2 {
    
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,6,9};
         pattern(arr);
    }
    static void pattern(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int j =0;
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                ans[j++] = arr[i];
            }
        }
        System.out.println(j); 
        for(int i =0;i<n;i++){
            if(arr[i]%2!=0){
                ans[j++] = arr[i];
            }
        }
        for (int k = 0; k < j; k++) {
            System.out.print(ans[k] + " ");
        } 
    }
}         // but if you use two pointer method you will be easily can do anything
