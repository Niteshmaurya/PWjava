import java.util.Scanner;

public class L27prefixMatrixM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int arr[][] = makeMatrix(n);
        printMatrix(arr);
        int arr1[][] = prefixSum(arr);

        int[][] arr2 = prefixSum2(arr1); // column prefixSum
        System.out.println("prefix Sum columnwise is : ");
        printMatrix(arr2);
        int ans = findSum2(arr1);
        System.out.println("sum is : " + ans);
    }

    static int findSum2(int arr[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial point final point ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

           
            int sum =0,up = 0,left = 0,upLeft = 0;   

             sum = arr[r2][c2];
             if(r1>0)
             up = arr[r1 - 1][c2];
             if(c1>0)
             left = arr[r2][c1 - 1];
             if(r1>0&&c1>0)
             upLeft = arr[r1 - 1][c1 - 1];
            int ans = sum - up - left + upLeft;
            return ans;
    }

    static int[][] prefixSum2(int arr[][]) { // for column prefixSum
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                arr[i][j] = arr[i][j] + arr[i - 1][j];
            }
        }
        return arr;
    }

    static int[][] prefixSum(int arr[][]) { // for row prefixSum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                arr[i][j] = arr[i][j] + arr[i][j - 1];
            }
        }
        return arr;
    }

    static int[][] makeMatrix(int n) {
        int r = n, c = n;
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
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
