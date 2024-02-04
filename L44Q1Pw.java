public class L44Q1Pw {
    public static void main(String[] args) {
        int arr[] = {0,5,0,3,4,2};
        int n = arr.length;
        getAns(arr,n);
        for(int val : arr){
            System.out.println(val);
        }
    }
    static void getAns(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<n-1-i;j++){
                if(arr[j]==0&&arr[j+1]!=0){
                    // swap arr[j],arr[j+1]
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
