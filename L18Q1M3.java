public class L18Q1M3 {
    public static void main(String[] args) {
        int arr[] = { 1,0,1,0,1,1,0,0,0};
        sortArray(arr);
    }
    static void sortArray(int arr[]){
        int left = 0,right = arr.length -1;        
        while(left<right){
            if(arr[left] == 1 && arr[right] ==0){   
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0)
            left++;   
            if(arr[right]==1)
            right--; 
        }
        for(int k =0;k<arr.length;k++){
            System.out.print(" "+arr[k]);
        }
    }     
    static void swap(int arr[],int in,int fin){
        int temp = arr[in];
        arr[in] = arr[fin];
        arr[fin] = temp;   
    }
}
