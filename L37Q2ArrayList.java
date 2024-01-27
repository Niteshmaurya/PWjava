import java.util.ArrayList;

public class L37Q2ArrayList {
    public static void main(String[] args) {
         int arr[] = {1,2,3,2,3,4,2,3};
         int t = 2;
         int n = arr.length;
        ArrayList<Integer> ans =  allIndices(arr,n,t,0);
        for(Integer i : ans){
            System.out.println(i);
        }
    }
    static ArrayList<Integer> allIndices(int arr[],int n,int t,int idx){
        if(idx>=n){
            return new ArrayList<Integer>();    // return empty arrayList
        }
        ArrayList<Integer> ans = new ArrayList<>();   // {4 4 3 4}   ==> {0,1,3}
        //self work
        if(t==arr[idx])
        ans.add(idx);

        // recursion work 
        ArrayList<Integer> smallAns =   allIndices(arr, n, t, idx+1);

        ans.addAll(smallAns);
        return ans;

    }
}
