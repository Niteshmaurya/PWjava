import java.util.Scanner;

public class L33powerM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and n ");
        int a = sc.nextInt();
        int n = sc.nextInt();
        int ans = pow(a,n);
        System.out.println("ans "+ans);
    }
    static int pow(int a,int n){
        if(n==1){
            return a;
        }
       else if(n%2==0)
       return pow(a,n/2)*pow(a, n/2);
       else if(n%2!=0)  
       return pow(a, n/2)*pow(a, n/2)*a;
       return 0;    
    }

}
