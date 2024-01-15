import java.util.Scanner;


public class readChar {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter your character ");
    char ch = sc.next().charAt(0);
    System.out.println("character is "+ch);
    }
     
}