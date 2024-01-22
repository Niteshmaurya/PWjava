public class L19Q3 {
    public static void main(String[] args) {
        int arr[] = {5,3,2,6,3,1};   
        int arr2[] = {2,1,3,4,5,6};
        prefixSum(arr);
        System.out.println();
        suffixSum(arr2);   

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
    

    static void suffixSum(int arr[]){
        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            arr[i] = arr[i] + arr[i +1];
        }

        for(int k =0;k<n;k++){
            System.out.print(" "+arr[k]);
        }
        
        
    }
}
