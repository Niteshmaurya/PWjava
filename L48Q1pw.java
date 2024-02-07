public class L48Q1pw {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,6,7,8};
        System.out.println("Before sorting ");
        DisplayArray(arr);
        System.out.println("");
        System.out.println("after sorting ");
        sort(arr);
        DisplayArray(arr);  
    }
    static void sort(int arr[]){
        int n = arr.length;
        int x = -1;
        int y = -1;

        if(n<=1){
            return ;   // solving edge cases or corner cases 
        }

        for(int i =1;i<n;i++){
            if(arr[i]<arr[i-1]){    // first conflict
                if(x==-1){
                    x = i-1;
                    y = i;
                }
                else{     // 2nd conflict
                    y = i;
                }
            }

        }
    }
    static void DisplayArray(int arr[]){
        for(int val : arr)
        System.out.print(val+" ");
    }
    static void swap(int arr[],int l,int m){
        int temp = arr[l];
        arr[l] = arr[m];
        arr[m] = temp;
    }
    
}
