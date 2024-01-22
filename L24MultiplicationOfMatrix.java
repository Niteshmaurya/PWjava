import java.util.Scanner;

public class L24MultiplicationOfMatrix {
    static int r1,r2,c1,c2;
  

    public static void main(String[] args) {
        int arr1[][] = takeArray();
        int arr2[][] = takeArray();
    
        r1 = arr1.length;   // no. of rows in matrix 
        c1 = arr1[0].length;     // no. of columns in row 0 
    
        r2 = arr2.length;
        c2 = arr2[0].length;
    
         mulMatrix(arr1, arr2);
        System.out.println("Matrix 1:");
        printMatrix(arr1);
    
        System.out.println("Matrix 2:");
        printMatrix(arr2);
    
        
    }
    
    static void printMatrix(int arr[][]){
        for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

    static void mulMatrix(int arr1[][],int arr2[][]){
        if(c1!=r2){
            System.out.println("multiplication is not possible - input is not correct");
            return;
        }
        int[][] ans = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k =0;k<c1;k++){
                    ans[i][j] = ans[i][j]+ arr1[i][k] * arr2[k][j];
                }

            }
        }
        System.out.println("answer is ");
        printMatrix(ans);
    }

  

    static int[][] takeArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows in matrix ");
        int r = sc.nextInt();
        System.out.println("Enter the no. of column in matrix ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of array ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;

    }
}
