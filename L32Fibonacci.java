import java.util.Scanner;

public class L32Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = sc.nextInt();
        for(int i =0;i<=n;i++){
            int ans = fibo(i);
            System.out.println(ans);  

        }
    }
    static int  fibo(int n){
        if(n==0 || n==1 )  return n;
        
        else
            return fibo(n-2) +fibo(n-1);       
    }
}
