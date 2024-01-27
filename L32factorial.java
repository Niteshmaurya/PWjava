import java.util.Scanner;

public class L32factorial {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of n ");
         int n = sc.nextInt();
         int ans = Fact(n);
         System.out.println(ans);
    }
    static int  Fact(int n ){
        if(n==1 || n ==0){
            return 1;
        }
        else {
            return Fact(n-1)*n;
        }
        // return n;
    }
}
