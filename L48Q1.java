public class L48Q1 {
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
        int l = getDistortion(arr,0,n-1);
        int m = getDistortion(arr,l+1,n-1);
        swap(arr,l,m+1);
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
    static int getDistortion(int arr[],int a,int b){
        int n = arr.length;
        for(int i =a;i<=b;i++){
            if(arr[i]>arr[i+1])
            return i;
        }
        return 0;
    } 
}
