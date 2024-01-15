public class L16Q5 {
    
    public static void main(String[] args) {
        int arr[] = { 1,2,2,4,5,3,3,6};       
        int ans = firstRepeat(arr);
        System.out.println(ans);
    }
    static int  firstRepeat(int arr[]){
        int ans =0,i;
        int count = 0;
        int arr2[] = {};
        for(i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   break;
                  
                }
            } 
        }
        System.out.println(i);           
       
        
        return -1;
    }
}
