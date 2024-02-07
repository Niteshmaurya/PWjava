public class L48Q3 {
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
    static void sort(int arr[]){
        int count2 = 0; 
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i] == 2)
                count2++;
        }
        int sum =0;
        for(int i : arr)
        sum = sum + i;

        int count1 = sum - 2 * count2;
        int a1 = n - count1 - count2;
        int a2 = a1 + count1 -1;
        for(int i =0;i<n;i++){
            if(0<=i&&i<a1)
            arr[i] = 0;
            else if (a1<=i&&i<=a2)
            arr[i] = 1;
            else if (a2<i&&i<=a2+count2) 
            arr[i] = 2;
            
        }
    }
}
