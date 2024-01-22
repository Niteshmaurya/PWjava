import java.util.Scanner;

public class L26spiral2 {
    public static void main(String[] args) {  
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        makeItspiral(n);
    }

    static void makeItspiral(int n) {
        int r = n , c = n ;
        int arr[][] = new int[r][c];
        int tr = 0, br = r-1, lc = 0, rc = c-1;
        int totalElement = 1;
        int num = 1;

        while (totalElement <= r * c) {

            // tr --> lc to rc fix i = tr
            for (int j = lc; j <= rc; j++) {
                arr[tr][j] = num++;
                totalElement++;

            }
            tr++;
            // rc --> tr to br fix j = rc
            for (int i = tr; i <= br; i++) {
                arr[i][rc] = num++;
                totalElement++;

            }
            rc--;
            // br --> rc to lc fix i = br
            for (int j = rc; j >= lc; j--) {
                arr[br][j] = num++;
                totalElement++;

            }
            br--;

            // lc --> br to tr fix j = lc
            for (int i = br; i >= tr; i--) {  
                arr[i][lc] = num++;
                totalElement++;
            }
            lc++;

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
