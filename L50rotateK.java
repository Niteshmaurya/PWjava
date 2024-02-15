public class L50rotateK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 5;
        rotateK(arr, k);   
    }
    static void DisplayArray(int arr[]){   
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotateK(int arr[],int k){
        int ans[] = new int[arr.length];
        int n = arr.length;
        for(int i =0;i<n;i++){  
            ans[(i+k)%n] = arr[i];
        }
        DisplayArray(ans);
    }
}
