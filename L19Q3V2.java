public class L19Q3V2 {
    public static void main(String[] args) {
        int arr[] = {5,3,2,6,3,1};   
        // findSubArray(arr);
        System.out.println(findSubArray(arr));
    }
    static int findSubArray(int arr[]){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        int prefix =0;
        int suffix;
        for(int i =0;i<arr.length;i++){
            prefix = prefix + arr[i];
            suffix = sum - prefix;
            if(prefix == suffix)
            return i;
        }
        return prefix;
    }
}
