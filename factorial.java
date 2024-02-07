import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int fact =1; 
        // int temp ;
        // temp = n;
        // n =1;
        // while (n>1) {
        //     fact = n * (n-1);
        //     n--;
        // }   
        // System.out.println("Factorial of "+temp+" is " +fact); 
        int fact = 1;
        for(int i =1;i<=n;i++){
             fact = fact * i;
        }  
        System.out.println("Factorial of " +n+" is "+fact);
    }
}
