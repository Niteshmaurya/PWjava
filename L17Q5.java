import java.util.Scanner;

public class L17Q5 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
       
        System.out.println("enter the value of k ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        // while(k>0){   
        //     rotateOne(arr);
        //     System.out.println("\n");
        //     k--;
        // }   
        rotateInplace(arr, k);
              
    }
    static void rotateOne(int arr[]){
        int n = arr.length;
        int temp =arr[n-1];   
        for(int i=n-1;i>=1;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for(int i =0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }

    static void rotateInplace(int arr[],int k){    
        int n = arr.length;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
        for(int i =0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    } 
    // static int[] reverse(int arr[],int in,int fi){
    //     int n = arr.length;
    //     for(int i = in;i<(in + fi + 1)/2;i++){          
    //         int temp = arr[i];
    //         arr[i] = arr[n-i];
    //         arr[n-i] = temp;
    //     }
    //     return arr;
    // }

    static int[] reverse(int arr[], int in, int fi) {
        int n = arr.length;
        for (int i = in; i < (in + fi + 1) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[fi - i + in];
            arr[fi - i + in] = temp;
        }
        return arr;
    }
    
    

}
