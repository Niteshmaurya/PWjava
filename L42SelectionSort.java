public class L42SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        int n =arr.length;
        int ans[] = insertionSort(arr,n);
        for(int i =0;i<n;i++){
            // System.out.println(ans[i]);  
        }
    } 
    static int[] insertionSort(int arr[],int n){
        int[] ans = new int[n];
        int min = arr[0];
        int j=0;
        for(int k=0;k<n;k++){
        for(int i =1;i<n;i++){
            if(min>arr[i]){

                min = arr[i];
                j = i;
            }
        }
        ans[k] = min;
    }
        arr[j] = 100;
        System.out.println("min is "+min);  
        System.out.println("min at index of  "+j); 
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        } 
        return ans;
    }
}
