public class L17Q2 {
    public static void main(String[] args) {
        int arr[] = {23,34,5,6};
        reversArray(arr);
    }
    static void reversArray(int arr[]){   
      for(int i = arr.length-1;i>=0;i--){
        System.out.println(arr[i]);          
      }
       
    }
}
