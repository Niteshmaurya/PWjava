public class L52Q1ChoclatePb {
    public static void main(String[] args) {
        int arr[] = { 5,3,1,4,2};  
        // int arr[] = {12,34,67,90};
        int m =2;
        int ans = distributeChoclate(arr,m);
        System.out.println(ans);
    }
    static int distributeChoclate(int a[],int m){
        int st =0;
        int end = (int)1e9;
        int ans =0;
        if(a.length<m) return -1;
        while (st<=end) {
            int mid = st + (end -st)/2;  
            if(isDivisionPossible(a,m,mid)){
                ans = mid;
            end = mid -1;
            }
            else 
            st = mid +1;
        }
        return ans;
    }
    static boolean isDivisionPossible(int arr[],int m,int maxChocAll){
        int numOfStudent = 1;
        int choc = 0;   // num of choc current student have 
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maxChocAll) return false;     
            if(choc + arr[i] <= maxChocAll){
                choc = choc +arr[i];
            }
            else{
                numOfStudent++;
                choc = arr[i];
            }
        }
        // if(numOfStudent <= m) return true;
        // else return false;

        return numOfStudent<=m;
    }
}
