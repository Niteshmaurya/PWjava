import java.util.Scanner;

public class L24_2DArayy {

     public static void main(String[] args) {
        // int arr[3][3] = {};
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no. of rows");
        int r = sc.nextInt();
        System.out.println("enter the no. of columns");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];                        
        System.out.println("Enter the elements of 2D array ");
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){       
                arr[i][j] = sc.nextInt();
            }
        } 
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println("\n");     
        } 
     }
}