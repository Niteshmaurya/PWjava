import java.util.Scanner;

public class L34Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num and k");
        int num = sc.nextInt();
        int k = sc.nextInt();
        mul(num,k);
    }
    static void mul(int num,int k){
        if(k==1){
            System.out.print(num +", ");
        }
        else
        {
            mul(num,k-1);
            System.out.print(num * k+", ");
        }
    }
}
