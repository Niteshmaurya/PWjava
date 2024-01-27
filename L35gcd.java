import java.util.Scanner;

public class L35gcd {
    public static void main(String[] args) {
        System.out.println("enter the value of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcd(a,b);
        System.out.println("gcd is "+ans);  
    }
    static int gcd(int a ,int b){
        int small = a>b?b:a;
        for(int i =small;i>=1;i--){
            if(a%i==b%i){
                return i;
            }
        }
        return 0;
    }
}
