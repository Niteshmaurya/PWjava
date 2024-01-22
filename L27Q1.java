import java.util.Scanner;

public class L27Q1 {
    public static void main(String[] args) {
        //  int arr[][] = {{1,1,1}}
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = makeMatrix(n);
        System.out.println("Enter the values of initial point and final point");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();  
        int ans = GvieAddition(arr,l1,r1,l2,r2);
        printMatrix(arr);  
        System.out.println("Sum is "+ans);
    }

    static int  GvieAddition(int arr[][],int l1,int r1,int l2,int r2){    // this is brute force method not more optimized we will make optimized code 
        int ans =0;
        for(int i =l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                ans = ans + arr[i][j];
            }  
        }
        return ans;
    }
    static int[][] makeMatrix(int n){
        int r =n,c=n;
        int arr[][] = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = 1;
            }
        }
        // printMatrix(arr);
        return arr;
    }
    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
