import java.util.Scanner;

public class L39SubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        subSetSum(arr,n,0,0);
    }
    static void subSetSum(int arr[],int n,int idx,int currSSsum){
        if(idx>=n){
            System.out.println(n);
        }
    }
}
