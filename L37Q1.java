public class L37Q1 {
    public static void main(String[] args) {
        int arr[] = { 1,2,34,56,564};
        boolean ans = findElement(arr,0,2);
        System.out.println(ans);
    }
    static boolean findElement(int arr[],int idx,int f){
        if(idx==arr.length)
        return false;
        if(f == arr[idx]) return true;
        else {
        return findElement(arr, idx+1, f);
        }
    }
}
