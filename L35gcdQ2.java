import java.util.Scanner;

public class L35gcdQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a,b);
        
    }
    static void gcd(int a,int b){  
        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println("ans : "+b);
    }
}
