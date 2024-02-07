public class L47CountSortv2 {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,4,3};
        System.out.println("before sorting the array");
        DisplayArray(arr);
        basicCountSort(arr);
        System.out.println("After sorting the array");
        DisplayArray(arr);

    }
    static void DisplayArray(int arr[]){
        for(int val : arr)
        System.out.print(val+" ");
    }
    static void basicCountSort(int arr[]){
        // find the largest element 
        int max = findMax(arr);
        int count[] = new int[max +1];
        for(int i =0;i<arr.length;i++){
             count[arr[i]]++;                 // 0 0 0 2 2 1 1  
        }
        int k =0;
        for(int i=0;i<= max;i++){
            for(int j=0;j<count[i];j++){
                arr[k++] = i;                //  0   
            }
        }
    }
    static int findMax(int arr[]){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];
        }
        return max;
    }
}
