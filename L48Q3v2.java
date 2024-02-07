public interface L48Q3v2 {
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0,0};
        System.out.println("Before sorting ");
        DisplayArray(arr);
        System.out.println("");
        System.out.println("after sorting ");
        sort(arr);  
        DisplayArray(arr);  
    }
    static void DisplayArray(int arr[]){
        for(int val : arr)
        System.out.print(val+" ");
    }
    static void sort(int a[]){
        int n = a.length;
        int lo = 0;
        int mid = 0;
        int high = n-1;
        while (mid<=high) {
            if(a[mid]==0){
                swap(a,mid,lo);
                lo++;
                mid++;
            }
            else if (a[mid]==1)
            mid++;
            else if (a[mid]==2){
            swap(a,mid,high);
            high--;
            }
        }
        
    }
    static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
