public class L48Q2 {
    public static void main(String[] args) {
        int arr[] = {19,-20,34,0,-35,-23,33};    
        System.out.println("Before sorting ");
        DisplayArray(arr);
        System.out.println("");
        System.out.println("after sorting ");
        segregate(arr);  
        DisplayArray(arr);  
    }
    static void DisplayArray(int arr[]){
        for(int val : arr)
        System.out.print(val+" ");
    }
    static void segregate(int arr[]){
        int n = arr.length;
        int count =0;
        for(int i =0;i<n;i++){
            if(arr[i]<0){
                count++;
            }
        }
        int i =0;
        int j = n-1;
        while (i<count ) {
            if(arr[i]>0&&arr[j]<0)
                swap(arr,i++,j--);
            else if (arr[i]<=0)
            i++;
            else if (arr[j]>0)
            j--;
        }
        
    }
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
