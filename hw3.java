import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        System.out.println("Enter cost price");
        Scanner sc = new Scanner(System.in);
        float cp = sc.nextFloat();
         System.out.println("Enter selling price");
         float sp = sc.nextFloat();
         float pl = (sp - cp);
         float per = (pl *100)/cp;

        if(sp > cp){
            System.out.println("Congrats YOU have profit in your cleaning business");
            System.out.println("you have profit of " +pl +" and percentage is "+ per +"%");
        }
        else{
            pl = (-1) * pl;
            per = (-1) * per;
            
            System.out.println("Sorry you have loss in your nadani business");
            System.out.println("you have loss of "+ pl + " and per is "+per);
        }
    }
}
