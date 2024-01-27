import java.util.Scanner;

public class L34Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println("ans "+ans);
    }
    static int sum(int n){
        int k = 1;
        // if(n%2==0)
        // k = -1;
        // else if (n%2!=0)
        // k =1;
   
        k = n%2==0?-1:1;
        if(n==1)
        return 1;
        else{
            return k*n +   sum(n-1);
        }
    }
}
