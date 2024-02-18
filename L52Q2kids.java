public class L52Q2kids {
    public static void main(String[] args) {
        int arr[] = {1,2,4,8,9};
        int m =3;  
        int ans = kidsDistribution(arr,m);
        System.out.println(ans);    

    }
    static int kidsDistribution(int arr[],int m){
        int st =1,ans =0;
        int end = (int)1e9;
        while (st<=end) {
            int mid = st +(end-st)/2; 
            if(arr.length<m)return -1;
            if(isDistPossible(arr,m,mid))    // can k kids will be placed such that no 2 kids have less than mid 
            {
                ans = mid;
                st = mid +1;
            }
            else
            end = mid -1;
        }
        return ans;
    }
    static boolean isDistPossible(int a[],int m,int minDistAllowed){
        int kidsPlaced = 1;
        int lastKidsPosition = a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]- lastKidsPosition >= minDistAllowed){
                kidsPlaced++;
                lastKidsPosition = a[i];
            }
            
        }
        return kidsPlaced>=m;
        // if(kidsPlaced>m)return false;
        // else return true;
    }
}
