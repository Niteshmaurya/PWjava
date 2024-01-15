import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        System.out.println("This is under main fuction and under sum class\n");

        algebra allu = new algebra(7,5);  // jab object banate hai to constructor call ho jata hai automatically 

        System.out.println(allu);
        System.out.println(allu.add());
        System.out.println(allu.subtract());
        System.out.println(allu.multipy());

        algebra sallu = new algebra(10, 5);
        System.out.println(sallu);
        System.out.println(sallu.add());
        System.out.println(sallu.subtract());
    }
}

class algebra{
    int a,b;
    
    algebra(int x,int y){   // this is parameterized constructor
        System.out.println("This is constructor under algebra class ");   
        a = x;
        b = y;   
    }
    int add(){
        return a +b;
    }
    
    int subtract(){
        return a -b;
    }
    int multipy(){
        return a * b;
    }
}