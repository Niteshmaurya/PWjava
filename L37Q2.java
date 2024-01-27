public class L37Q2 {
    public static void main(String[] args) {
        int arr[] = {12,3,4,5,6,3,4,7,3};
        int t = 4;
         getAllIndex(arr,t,0);
    }
    static void getAllIndex(int arr[],int t,int idx){
        if(idx==arr.length) return ;    
        if(arr[idx]==t){
            System.out.println(idx); 
        }
         getAllIndex(arr, t, idx+1);

    }
}
