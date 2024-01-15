import java.util.Scanner;

public class L17Q4 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        // rotateOne(arr);
        System.out.println("enter the value of k ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        rotateK(arr, k);   
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

    static void rotateK(int arr[],int k){
        int n = arr.length;
        k = k % n;
        int j =0;
        int ans[] = {};   
        for(int i = n-k;i>n;i++){
            ans[j++] = arr[i];
        }
        for(int i = 0;i<n-k;i++){
            arr[j++] = arr[i];
        }
        for(int i =0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }

}
