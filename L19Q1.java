public class L19Q1 {
    public static void main(String[] args) {
        int arr[] = { 1,2,10,4,5};
        int k =3;  
        pref(arr,k);
    }
    static void pref(int arr[],int k){
        int sum = 0;            // but its not actual prefixSum so we have to make changes for the right answer  arr[n] = arr[i] + arr[n-1]
        for(int i =0;i<=k;i++){
            sum = sum + arr[i];
        }
         arr[k]= sum;
         for(int j =0;j<arr.length;j++){
            System.out.print(" "+arr[j]);
         }
    }
}
