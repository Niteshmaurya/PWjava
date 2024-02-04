public class L46QuickSort {

     public static void main(String[] args) {
        int arr[]={5,13,8,7,10,2,4};
        int n = arr.length;  
        System.out.println("array before sorting");
        DisplayArr(arr,n);

        quickSort(arr, 0, n-1);
        System.out.println("");
        System.out.println("array after sorting");
        DisplayArr(arr,n);
     }

     static void quickSort(int arr[],int st,int end){
        if(st>=end) return;

        int pi = partition(arr,st,end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1,end);
 
     }
     static int partition(int arr[],int st,int end){
        int pivot = arr[st];  
        int cnt =0;

        for(int i =st+1;i<=end;i++){
            if(arr[i]<=pivot)
            cnt++;
        }  
        int pi = st + cnt;
        swap(arr, st, pi );
        int i = st;
        int j = end;

        // element lesser left side
        while (i<pi&&j>pi) {
            while (arr[i]<=pivot&&i<pi) i++;
            while (arr[j]>pivot&&j>pi) j--;     
            if(i<pi&&j>pi){
                swap(arr, i, j);
                i++;
                j--;
            }
            
        }

        return pi;
     }
  
     static void DisplayArr(int arr[],int n){
        for(int i=0;i<n;i++){  
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}