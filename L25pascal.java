import java.util.Scanner;

public class L25pascal {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GivePascal(n);
    }
    static void GivePascal(int n){
        int ans[][] = new int[n][];
        for(int i =0;i<n;i++){
        //   ith row have i +1 columns 
        ans[i] = new int[i+1];
        //  1st and last element of every row is 1
        ans[i][0] = ans[i][i] = 1;

        // jagged Array
        for(int j =1;j<i;j++){
            ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
        } 
        }   
        printMatrix(ans);   
    }
    static void printMatrix(int arr[][]){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }  

    }
}
