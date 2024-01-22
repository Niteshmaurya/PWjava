import java.util.Scanner;

public class L27Q1Opti {    
    public static void main(String[] args) {
        //  int arr[][] = {{1,1,1}}
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = makeMatrix(n);
        System.out.println();
        prefixSumMatrix(arr);
        printMatrix(arr);  
        prefixSumColMatrix(arr);
        printMatrix(arr);  

    }
    static void prefixSumColMatrix(int arr[][]){
        for(int i =0;i<arr.length;i++){
        for(int k =0;k<arr.length;k++){
            prefixSumCol(arr[i][k]); 
        }
        }
    }
    static void prefixSumCol(int arr[][]){
        for(int i =0;i<arr.length;i++){
            for(int j =1;j<arr.length;j++){
                arr[i][j]= arr[i][j] + arr[i][j-1];
            }
        }
    }
    static void prefixSumMatrix(int arr[][]){
        for(int i =0;i<arr[0].length;i++){
            GetPrefixSum(arr[i]);
        }
    }
    static int[] GetPrefixSum( int arr[]) {
        for (int i = 1; i < arr.length; i++) {    
            arr[i] = arr[i] + arr[i - 1];     //  this is optimized code
        }
        return arr;
    }
    static void findSum(int arr[][]){
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the values of initial point and final point");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();  

        int sum = 0;
        for(int i = l1;i<=l2;i++){
            for(int j = r1;j<=r2;j++){
                sum  = sum + arr[i][j];
            }
        }
        System.out.println("Sum = "+sum);
    }

   

    
    static int[][] makeMatrix(int n){
        int r =n,c=n;
        int arr[][] = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = 1;
            }
        }
        printMatrix(arr);
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
