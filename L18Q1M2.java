public class L18Q1M2 {
    
    public static void main(String[] args) {
        int arr[] = { 1,0,1,0,1,0,1,0};
        int countZero = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0)
            countZero++;
        }
        sort(countZero,arr);
    }
    static void sort(int c,int arr[]){
        for(int i =0;i<arr.length;i++){
            if(i<c)
            arr[i] =0;
            else
            arr[i] = 1; 
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }   
}
