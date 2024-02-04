public class L45MergeSortGPT {
    public static void main(String[] args) {
        int arr[] = {7,20,4,11,8,2};
        int n = arr.length;
        System.out.println("array before sorting");
        DisplayArr(arr,n);
        MergeSort(arr,0,n-1);
        System.out.println("");
        System.out.println("array after sorting");
        DisplayArr(arr,n);
    }    
    static void DisplayArr(int arr[],int n){
        for(int i=0;i<n;i++){  
            System.out.print(arr[i]+" ");
        }
    }
    static void MergeSort(int arr[],int l,int r){
    // base case 
    if(l==r){
        return;
    }

        // big problem
        int mid = (l+r)/2;
        MergeSort(arr,l,mid);
        MergeSort(arr,mid+1,r);
        mergeArray(arr,l,mid,r);
         
    }
    static void mergeArray(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i = 0; // Reset i to 0
        int j = 0; // Reset j to 0
        int k = l; // Start k from l
    
        // Fill the left array and right array
        for (int a = 0; a < n1; a++)
            left[a] = arr[l + a];
        for (int b = 0; b < n2; b++)
            right[b] = arr[mid + 1 + b];
    
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
    
    }

