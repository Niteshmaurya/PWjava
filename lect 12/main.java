// package pw.skills;
import java.util.Scanner;

 class algebra {
  int a;
  int b;
  
  algebra(int x, int y){
   
  a= x;
  b = y;
    System.out.println("Construcor of Algebra class is called");
  }
  int add(){
    int ans = a +b;
    return ans;
  }
  int sub(){
    return a -b;
  }
  int mul(){
    return a *b;
  }
  int div(){
    return a/b;
  }
        
}
 public class main{   
    public static void main(String[] args) {    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of X and Y");   
        int x = sc.nextInt();
        int y = sc.nextInt();
        algebra obj = new algebra( x, y);
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());
    }
    
}