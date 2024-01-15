import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal no.");
        int n = sc.nextInt();
        int i=0,j;
        int ans = 0;    //binary no.
        int pw = 1;     // powers of 10

        while(n>0){
            int parity = n%2;
            ans = ans + (parity *pw);
            pw = pw *10;
            n = n/2;
        }
        System.out.println(ans);
    }
}
