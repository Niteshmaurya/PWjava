public class L37Q2byArray {
    static    int i =0;

    public static void main(String[] args) {
        int arr[] = {12,3,4,5,6,3,4,7,3};
        int t = 3;
          getAllIndex(arr,t,0);
        //  for(int i =0;i<arr.length;i++){
        //     System.out.println(ans[i]);
        //  }
    }
    static void getAllIndex(int arr[],int t,int idx){
        int newArray[] = new int[5];  
        if(idx==arr.length) return;      
        if(arr[idx] == t ) {
            newArray[i] = idx; 
            // System.out.println("for i : " +i +" is "+newArray[i]);
            i++;
        }
        getAllIndex(arr, t, idx+1);
         for(int j =0;j<newArray.length;j++){
            System.out.print(newArray[j]+" ");     
         }
        

    }
}
  