import java.util.Scanner;

public class L31PD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        PD(n);
    }
    static void PD(int n){
        if(n==1){
        System.out.println(1);     // base case ya halting condition is that which prevents the infinite loop
        return ;
        }
        else {
            System.out.println(n);
            PD(n-1);
        }

    }
}
