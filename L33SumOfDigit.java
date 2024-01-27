import java.util.Scanner;

public class L33SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int ans = SumOfDigit(n);
        System.out.println("ans = "+ans);  
    }
    static int SumOfDigit(int n ){
        int d = n %10;
        if(d==1){
            return d;
        }
        else {
            return n%10+SumOfDigit(n/10);  
        }
    }
}
