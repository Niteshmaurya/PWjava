public class L16Q4 {
    public static void main(String[] args) {
        int arr[] = { 2,4,5,3,-45};

        int max = find2max(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max)
            arr[i] = Integer.MIN_VALUE;
        }
        int SecondMax = find2max(arr) ;
        System.out.println(SecondMax);

    }
    static int find2max(int arr[]){
        int max = arr[0];
        int index =0 ;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
            
        }
     return max;

    }
}
   