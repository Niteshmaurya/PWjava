import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 )
        System.out.println("Entered year is leap year");
        else
        System.out.println("Not leap year ");
    }
}
