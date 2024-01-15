public class L15Q3 {
    public static void main(String[] args) {
        int arr[] = {2,4,5};
        isSorted(arr);
        System.out.println("Is sorted "+isSorted(arr));    
    }
    static boolean isSorted(int arr[]){
        boolean check = true;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){

                check = false;
                break;
            }
        }
        return check;
    }
}
