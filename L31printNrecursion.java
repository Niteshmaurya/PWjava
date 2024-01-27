import java.util.Scanner;

public class L31printNrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int ans  = PI(n);
        // System.out.println(ans);
    }
    static int PI(int n){
        if(n==1){
        System.out.println(n);
        return 0;
        }
        else
        PI(n-1);
        System.out.println(n);  // actually it function of method is passed on call stack that's why it is calling first and then printing so in dry run it is calling first like is n == 4 then n --> 4 3 2 1 then printing from 1 2 3 4  that's the thing after calling a function the instance for that function calling is removed from callstack which is available in the RAM 
        return 0;
    }
}
