import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;       
        while (n>0) {
            sum = sum + n%10;
            n = n/10;  

        }
        System.out.println("Sum of digit is " +sum);       
    }
    
}
