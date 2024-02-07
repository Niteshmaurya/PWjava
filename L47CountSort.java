public class L47CountSort {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1, 4, 6, 3, 5, 6 };
        int n = arr.length;
        int count[] = CountArr(arr, n);
        int n1 = count.length;
        DisplayArr(count, n1);
        int ans2[] = basicCountSort(count, n1);  
        System.out.println("after basicCountSort");
        DisplayArr(ans2, ans2.length);
    }

    static void DisplayArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] CountArr(int arr[], int n) {
        int max = maxElem(arr, n);
        int count[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
          count[arr[i]]++;  
        }
        return count;
    }
    static int[] basicCountSort(int arr[],int n1){
        int k =0;
        for(int i=0;i<arr.length;i++){      
            for(int j=0;j<arr[i];j++){
                arr[k++] = i;
            }
        }
        return arr;
    }

    static int maxElem(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++)
            if (max < arr[i])
                max = arr[i];
        return max;
    }

}
