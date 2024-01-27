import java.util.Scanner;

public class L33power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and n ");
        int a = sc.nextInt();
        int n = sc.nextInt();
        int ans = pow(a,n);
        System.out.println("ans "+ans);
    }
    static int pow(int a,int n){
        if(n==1)
        return a;
        else{
            return a *pow(a, n-1);
        }
    }

}
