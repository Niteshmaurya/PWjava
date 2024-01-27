import java.util.Scanner;

public class L35gcdQ2Rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcd(a,b);
        System.out.println("Ans is "+ans );

    }
    static int gcd(int a,int b){       // this is euclids algorithm 
        if(b ==0) return a;
        else      
        return  gcd(b, a%b);
        
    }
}
