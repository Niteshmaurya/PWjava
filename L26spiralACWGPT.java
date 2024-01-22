 import java.util.Scanner;

public class L26spiralACWGPT {
    public static void main(String[] args) {
        System.out.println("Enter the value of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AntiSpiral(n);
    }   

    static void AntiSpiral(int n) {
        int r = n, c = n;
        int arr[][] = new int[r][c];
        int tr = 0, br = r - 1, lc = 0, rc = c - 1;
        int totalElement = 1;   
        int num = 1;

        while (totalElement <= r * c) {
            // i = tr --> br, j = rc
            for (int i = tr; i <= br && totalElement <= r * c; i++) {
                arr[i][rc] = num++;
                totalElement++;
            }
            rc--;

            // j = lc --> rc, i = br
            for (int j = rc; j >= lc && totalElement <= r * c; j--) {
                arr[br][j] = num++;
                totalElement++;
            }
            br--;

            // i = br --> tr, j = lc
            for (int i = br; i >= tr && totalElement <= r * c; i--) {
                arr[i][lc] = num++;
                totalElement++;
            }
            lc++;

            // j = lc --> rc, i = tr
            for (int j = lc; j <= rc && totalElement <= r * c; j++) {
                arr[tr][j] = num++;
                totalElement++;    
            }
            tr++;
        }
        printMatrix(arr);
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
