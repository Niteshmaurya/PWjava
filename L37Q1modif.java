public class L37Q1modif {
    public static void main(String[] args) {
        int arr[] = { 1,2,34,34,34,56,564};
        int ans = findElement(arr,0,34);
        System.out.println(ans);
    }
    static int findElement(int arr[],int idx,int f){
        if(idx==arr.length)
        return -1;
        if(arr[idx] == f) return idx;
        else {
            return findElement(arr, idx+1, f);
     }
    }
}
