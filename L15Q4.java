public class L15Q4 {
    public static void main(String[] args) {
        int arr[] = {23,3456,54,76};
        int ans[] = minMax(arr);
        System.out.println("smallest "+ans[0]+ " largest : "+ans[1]);
    }
    static int[] minMax(int arr[]){
        int min = arr[0],max =0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
            min = arr[i];
            if(max<arr[i])
            max = arr[i];
        }
        int MM[] = {min,max};
        System.out.println(MM[0]);
        return MM;
    }
}
