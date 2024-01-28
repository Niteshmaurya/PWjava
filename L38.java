import java.util.Scanner;

public class L38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String s = sc.nextLine();
        System.out.println(s);

        for(int i =0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        System.out.println(s.substring(0, 2));
    }
}
