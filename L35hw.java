import java.lang.Math; 
import java.util.Scanner;

public class L35hw {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isArmstrong(n);
    }
    static void isArmstrong(int n){
        int dig = 0;  
        int cout = 0;
        int sum = 0;  
        while(n>0){
            dig = n %10;
            n = n /10;
            cout++;
            sum = sum + (int)Math.pow(dig,3);
        }

        System.out.println("digits is "+cout);
        System.out.println("sum  is "+sum);

    }
}
