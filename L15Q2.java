public class L15Q2 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,6,5,4,5};
        int elem = 34;
        lastOccurence(arr,elem);
        System.out.println(lastOccurence(arr, elem));     
    }
    static int lastOccurence(int arr[],int elem){
        int index = -1;
        for(int i =0;i<arr.length;i++){
            if(elem == arr[i]){
                index = i;
            }
        }
        // System.out.println("last is "+index);
        return index;

    }
}
