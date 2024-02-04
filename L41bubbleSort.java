public class L41bubbleSort {
    public static void main(String[] args) {
        int arr[] = {7,5,4,3,1};
        int idx = 0;
        int n = arr.length;
        bubbleSort(arr,idx,n);
        for(int i: arr)
        System.out.print(i+" ");
    }
    static void bubbleSort(int arr[],int idx,int n){
        for(int i =0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                // last element of array is already at therer right position so no need to check that
                if(arr[j]>arr[j+1])  
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
                
                
            }
            if(!flag)
            return;
        }
    }
}
