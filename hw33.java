import java.util.Scanner;

public class hw33 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig = 0;
        while (n>0) {   
            n = n/10;
            dig++;
        }
        System.out.println("No. of digits is "+dig);   
        
    }
}
