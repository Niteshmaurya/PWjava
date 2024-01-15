public class L18Q1 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,1,0,1,1};
        sort(arr);
    }
    static void sort(int arr[]){
        sumOfArray(arr);
    }
    static void sumOfArray(int arr[]){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        System.out.println(arr.length);
        int diff = arr.length - sum;  // 4
        for(int i =0;i<arr.length;i++){   //  0 to 9   
            if(i<diff)
            arr[i] = 0;
            else
            arr[i] = 1;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
