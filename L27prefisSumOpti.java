import java.util.Scanner;

public class L27prefisSumOpti {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of n ");
         int n = sc.nextInt();
         int arr[][] = makeMatrix(n);
         printMatrix(arr);
         int arr1[][] = prefixSum(arr);
         System.out.println("prefix Sum rowise is : ");
         printMatrix(arr1);  
         findSum(arr1);

         

         int [][]arr2 = prefixSum2(arr1);                             // column prefixSum 
         System.out.println("prefix Sum columnwise is : ");
         printMatrix(arr2);  
    }

    static void findSum(int arr[][]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial point final point ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int sum =0;
        for(int i = r1;i<=r2;i++){
            sum += arr[i][c2] - arr[i][c1-1]; 
        }
        System.out.println("Sum is : "+sum);  
    }

    static int[][] prefixSum2(int arr[][]){    // for column prefixSum 
        for(int i =1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = arr[i][j] + arr[i-1][j];
            }
        }
        return arr; 
    }

    static int[][]  prefixSum(int arr[][]){  // for row prefixSum 
        for(int i =0;i<arr.length;i++){     
            for(int j =1;j<arr[0].length;j++){
                    arr[i][j] = arr[i][j] + arr[i][j-1];
            }
        }
        return arr;
    }


    static int[][] makeMatrix(int n){
        int r =n,c=n;
        int arr[][] = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = 1;
            }
        }
        return arr;
    }
    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
