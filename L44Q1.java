public class L44Q1 {
    public static void main(String[] args) {
        int arr[] = {0,5,0,3,4,2};
        getAns(arr);
    }
    static void getAns(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int j =0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){  
                j =i;
                while(j<n-1){   
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;   
                    j++;
                }
                // System.out.println("j is "+ j);
            }
        } 
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);  
        }
    }
}
