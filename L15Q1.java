public class L15Q1 {
    public static void main(String[] args) {
        int arr[] = {23,34,3456,34,77};
        int search = 34;
        searchElement(arr,search);
    }
    static void searchElement(int arr[],int s){
        int count = 0;
        // for(int i =0;i<arr.length;i++){
        //     if(s==arr[i])
        //     count++;
        // }

        for(int num : arr){
            if(num == s)
            count++;
        }
        System.out.println("no. of occurence of 34 is "+count);
    }
}
