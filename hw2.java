import java.util.Scanner;


public class hw2 {
    public static void main(String[] args) {
        System.out.println("Entered any no. which you wanted to enter");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0)
        {
            num = num * (-1);
        }
        else{
            num = num;
        }
        System.out.println("Absolute no. is "+num);
    }
}
