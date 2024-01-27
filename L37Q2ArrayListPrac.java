import java.util.ArrayList;

public class L37Q2ArrayListPrac {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,2,3,4};
        int t= 4;
        int n = arr.length;
        ArrayList<Integer> ans =  allIndices(arr,t,n,0);
        for(Integer i : ans){
            System.out.println(i);
        }
    }
    static ArrayList<Integer> allIndices(int arr[],int t,int n,int idx){
        if(idx>=n)
        return new ArrayList<Integer>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx]==t){
            ans.add(idx);
        }

        ArrayList<Integer> smallAns = allIndices(arr, t, n, idx+1);
        ans.addAll(smallAns);
        return ans;



    }
}
