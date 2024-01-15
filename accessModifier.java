public class accessModifier {
     String str_1 = "I am a public member";    // ye pure package me accessible hai    
    
    void printFromClass(){
        System.out.println("within class : "+str_1);
    }

    public static void main(String[] args) {
        accessModifier obj = new accessModifier();
        obj.printFromClass();
        System.out.println("Withing class :"+obj.str_1);

        App2 obj3 = new App2();
      obj3.printFromOutsideClass();


    }
}
class App2{
    void printFromOutsideClass(){
        accessModifier obj2 = new accessModifier();
        System.out.println("within package outside class "+obj2.str_1);
    }
}