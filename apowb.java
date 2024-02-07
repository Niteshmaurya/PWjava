import java.util.Scanner;

public class apowb {
    public static void main(String[] args) {
        System.out.println("Enter the values of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans =1;
        for(int i =1;i<=b;i++){
            ans = ans * a;
        }
        System.out.println("Ans of "+a+"^"+b+" is "+ans);
    }
}
