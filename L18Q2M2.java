public class L18Q2M2 {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,5,4,6,78,76,5};  
        getPattern(arr);
    }
    static void getPattern(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int n = arr.length;
            while (left<right) {
                if(arr[left]%2!=0  &&  arr[right]%2==0){
                    swap(arr,left,right);
                    left++;   
                    right--;
                }
                if(arr[left]%2==0)
                left++;
                if(arr[right]%2!=0)
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

