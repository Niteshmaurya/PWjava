import java.util.Scanner;

public class L19Q2 {    // this is bruttforce method that means it is not that much optimized therefor we will go for more optimixed method 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        int ln = sc.nextInt();
        int arr[] = new int[ln+1];

        for(int i =1;i<=ln;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no. of queries : ");
        int q = sc.nextInt();

        while(q>0){

        
        int l,r;
        System.out.println("enter the values of l and r");
        l = sc.nextInt();
        r = sc.nextInt();
        int sum =0;
        for(int i = l;i<=r;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum is " +sum);
        q--;
    }
    System.out.println("thank you ");
    }
}
