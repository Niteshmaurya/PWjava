import java.util.Scanner;

public class L50rotateKp2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("enter the value of k ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int ans[] = rotateK(arr, k); 
        DisplayArray(ans); 
    }   
    static void DisplayArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] rotateK(int arr[],int k){ 
        int n = arr.length;
        k = k %n;
        int ans[] = new int[n];
        for(int i =0;i<arr.length;i++){
            int j = n-k;
            // if(j<=n)
            ans[i] = arr[j++];  
        }
        return ans;
    }
}
