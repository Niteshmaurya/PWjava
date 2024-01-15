public class L16Q3 {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,2,1,3,4,5};
        findUnique(arr);
    }
    static void findUnique(int arr[]){
        int n = arr.length;
        int count =0;
        int unique = 0;
        for(int i=0;i<n;i++){
            count =0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i=0;i<n;i++){
            // System.out.println(arr[i]);
            if(arr[i]>0)
            System.out.println(arr[i]);
        }
        // System.out.println(unique);
    }
}
