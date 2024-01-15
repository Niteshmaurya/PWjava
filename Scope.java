
class Algebra{
    int a,b;          // member variables class level scoped
    int add(){
        return a +b;
    }
    int subtract(){
        int k;              // method level scoped
        return a -b;
    }
    {
        int j;              // block level scoped
    }
    void demo (){
        int l =10;
        System.out.println(l);
        System.out.println(m);  // we cannot access m because it is block level scoped 
        {
            
            int m =20;
            // here this m is valid 
        }
        {
            int m = 30;
            // here this m is valid 
            // it can be part of for loop while if else 
        }
    }
}

public class Scope {
    public static void main(String[] args) {
        int a =10;
    }
}
