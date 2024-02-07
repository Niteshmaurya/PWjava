import java.util.Scanner;

public class shauq {
    public static void main(String[] args) {
        System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num%5 == 0 || num % 3 == 0) && (num %15 !=0) ){
            System.out.println("that no.");
        }

    }
}
